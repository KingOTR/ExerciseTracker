package org.mapsforge.map.reader;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.model.Tile;
import org.mapsforge.core.util.LatLongUtils;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.datastore.MapReadResult;
import org.mapsforge.map.datastore.PoiWayBundle;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.datastore.Way;
import org.mapsforge.map.reader.header.MapFileException;
import org.mapsforge.map.reader.header.MapFileHeader;
import org.mapsforge.map.reader.header.MapFileInfo;
import org.mapsforge.map.reader.header.SubFileParameter;

/* loaded from: classes5.dex */
public class MapFile extends MapDataStore {
    private static final long BITMASK_INDEX_OFFSET = 549755813887L;
    private static final long BITMASK_INDEX_WATER = 549755813888L;
    private static final byte DEFAULT_START_ZOOM_LEVEL = 12;
    private static final int INDEX_CACHE_SIZE = 64;
    private static final String INVALID_FIRST_WAY_OFFSET = "invalid first way offset: ";
    private static final int POI_FEATURE_ELEVATION = 32;
    private static final int POI_FEATURE_HOUSE_NUMBER = 64;
    private static final int POI_FEATURE_NAME = 128;
    private static final int POI_LAYER_BITMASK = 240;
    private static final int POI_LAYER_SHIFT = 4;
    private static final int POI_NUMBER_OF_TAGS_BITMASK = 15;
    private static final byte SIGNATURE_LENGTH_BLOCK = 32;
    private static final byte SIGNATURE_LENGTH_POI = 32;
    private static final byte SIGNATURE_LENGTH_WAY = 32;
    private static final String TAG_KEY_ELE = "ele";
    private static final String TAG_KEY_HOUSE_NUMBER = "addr:housenumber";
    private static final String TAG_KEY_NAME = "name";
    private static final String TAG_KEY_REF = "ref";
    private static final int WAY_FEATURE_DATA_BLOCKS_BYTE = 8;
    private static final int WAY_FEATURE_DOUBLE_DELTA_ENCODING = 4;
    private static final int WAY_FEATURE_HOUSE_NUMBER = 64;
    private static final int WAY_FEATURE_LABEL_POSITION = 16;
    private static final int WAY_FEATURE_NAME = 128;
    private static final int WAY_FEATURE_REF = 32;
    private static final int WAY_LAYER_BITMASK = 240;
    private static final int WAY_LAYER_SHIFT = 4;
    private static final int WAY_NUMBER_OF_TAGS_BITMASK = 15;
    private final IndexCache databaseIndexCache;
    private final long fileSize;
    private final FileChannel inputChannel;
    private final MapFileHeader mapFileHeader;
    private final long timestamp;
    private byte zoomLevelMax;
    private byte zoomLevelMin;
    private static final Logger LOGGER = Logger.getLogger(MapFile.class.getName());
    public static final MapFile TEST_MAP_FILE = new MapFile();
    public static boolean wayFilterEnabled = true;
    public static int wayFilterDistance = 20;

    private enum Selector {
        ALL,
        POIS,
        LABELS
    }

    private MapFile() {
        this.zoomLevelMin = (byte) 0;
        this.zoomLevelMax = Byte.MAX_VALUE;
        this.databaseIndexCache = null;
        this.fileSize = 0L;
        this.inputChannel = null;
        this.mapFileHeader = null;
        this.timestamp = System.currentTimeMillis();
    }

    public MapFile(File file) {
        this(file, (String) null);
    }

    public MapFile(File file, String str) {
        super(str);
        this.zoomLevelMin = (byte) 0;
        this.zoomLevelMax = Byte.MAX_VALUE;
        if (file == null) {
            throw new MapFileException("mapFile must not be null");
        }
        try {
            if (!file.exists()) {
                throw new MapFileException("file does not exist: " + file);
            }
            if (!file.isFile()) {
                throw new MapFileException("not a file: " + file);
            }
            if (!file.canRead()) {
                throw new MapFileException("cannot read file: " + file);
            }
            FileChannel channel = new FileInputStream(file).getChannel();
            this.inputChannel = channel;
            long size = channel.size();
            this.fileSize = size;
            ReadBuffer readBuffer = new ReadBuffer(channel);
            MapFileHeader mapFileHeader = new MapFileHeader();
            this.mapFileHeader = mapFileHeader;
            mapFileHeader.readHeader(readBuffer, size);
            this.databaseIndexCache = new IndexCache(channel, 64);
            this.timestamp = file.lastModified();
        } catch (Exception e) {
            closeFileChannel();
            throw new MapFileException(e.getMessage());
        }
    }

    public MapFile(FileInputStream fileInputStream) {
        this(fileInputStream, (String) null);
    }

    public MapFile(FileInputStream fileInputStream, String str) {
        this(fileInputStream, System.currentTimeMillis(), str);
    }

    public MapFile(FileInputStream fileInputStream, long j, String str) {
        super(str);
        this.zoomLevelMin = (byte) 0;
        this.zoomLevelMax = Byte.MAX_VALUE;
        if (fileInputStream == null) {
            throw new MapFileException("mapFileInputStream must not be null");
        }
        try {
            FileChannel channel = fileInputStream.getChannel();
            this.inputChannel = channel;
            long size = channel.size();
            this.fileSize = size;
            ReadBuffer readBuffer = new ReadBuffer(channel);
            MapFileHeader mapFileHeader = new MapFileHeader();
            this.mapFileHeader = mapFileHeader;
            mapFileHeader.readHeader(readBuffer, size);
            this.databaseIndexCache = new IndexCache(channel, 64);
            this.timestamp = j;
        } catch (Exception e) {
            closeFileChannel();
            throw new MapFileException(e.getMessage());
        }
    }

    public MapFile(FileChannel fileChannel) {
        this(fileChannel, (String) null);
    }

    public MapFile(FileChannel fileChannel, String str) {
        this(fileChannel, System.currentTimeMillis(), str);
    }

    public MapFile(FileChannel fileChannel, long j, String str) {
        super(str);
        this.zoomLevelMin = (byte) 0;
        this.zoomLevelMax = Byte.MAX_VALUE;
        if (fileChannel == null) {
            throw new MapFileException("mapFileChannel must not be null");
        }
        try {
            this.inputChannel = fileChannel;
            long size = fileChannel.size();
            this.fileSize = size;
            ReadBuffer readBuffer = new ReadBuffer(fileChannel);
            MapFileHeader mapFileHeader = new MapFileHeader();
            this.mapFileHeader = mapFileHeader;
            mapFileHeader.readHeader(readBuffer, size);
            this.databaseIndexCache = new IndexCache(fileChannel, 64);
            this.timestamp = j;
        } catch (Exception e) {
            closeFileChannel();
            throw new MapFileException(e.getMessage());
        }
    }

    public MapFile(String str) {
        this(str, (String) null);
    }

    public MapFile(String str, String str2) {
        this(new File(str), str2);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public BoundingBox boundingBox() {
        return getMapFileInfo().boundingBox;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public void close() {
        closeFileChannel();
    }

    private void closeFileChannel() {
        try {
            IndexCache indexCache = this.databaseIndexCache;
            if (indexCache != null) {
                indexCache.destroy();
            }
            FileChannel fileChannel = this.inputChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
        }
    }

    private void decodeWayNodesDoubleDelta(LatLong[] latLongArr, double d, double d2, ReadBuffer readBuffer) {
        double microdegreesToDegrees = d + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
        double microdegreesToDegrees2 = d2 + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
        latLongArr[0] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (int i = 1; i < latLongArr.length; i++) {
            d3 += LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            d4 += LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            microdegreesToDegrees += d3;
            microdegreesToDegrees2 += d4;
            double d5 = -180.0d;
            if (microdegreesToDegrees2 >= -180.0d || (-180.0d) - microdegreesToDegrees2 >= 0.001d) {
                d5 = 180.0d;
                if (microdegreesToDegrees2 > 180.0d) {
                    if (microdegreesToDegrees2 - 180.0d >= 0.001d) {
                    }
                }
                latLongArr[i] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
            }
            microdegreesToDegrees2 = d5;
            latLongArr[i] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
        }
    }

    private void decodeWayNodesSingleDelta(LatLong[] latLongArr, double d, double d2, ReadBuffer readBuffer) {
        double microdegreesToDegrees = d + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
        double microdegreesToDegrees2 = d2 + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
        latLongArr[0] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
        for (int i = 1; i < latLongArr.length; i++) {
            microdegreesToDegrees += LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            microdegreesToDegrees2 += LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            double d3 = -180.0d;
            if (microdegreesToDegrees2 >= -180.0d || (-180.0d) - microdegreesToDegrees2 >= 0.001d) {
                d3 = 180.0d;
                if (microdegreesToDegrees2 > 180.0d) {
                    if (microdegreesToDegrees2 - 180.0d >= 0.001d) {
                    }
                }
                latLongArr[i] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
            }
            microdegreesToDegrees2 = d3;
            latLongArr[i] = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
        }
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public long getDataTimestamp(Tile tile) {
        return this.timestamp;
    }

    public MapFileHeader getMapFileHeader() {
        return this.mapFileHeader;
    }

    public MapFileInfo getMapFileInfo() {
        return this.mapFileHeader.getMapFileInfo();
    }

    public String[] getMapLanguages() {
        String str = getMapFileInfo().languagesPreference;
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return str.split(",");
    }

    private PoiWayBundle processBlock(QueryParameters queryParameters, SubFileParameter subFileParameter, BoundingBox boundingBox, double d, double d2, Selector selector, ReadBuffer readBuffer) {
        List<PointOfInterest> list;
        List<Way> processWays;
        if (!processBlockSignature(readBuffer)) {
            return null;
        }
        int[] iArr = readZoomTable(subFileParameter, readBuffer)[queryParameters.queryZoomLevel - subFileParameter.zoomLevelMin];
        int i = iArr[0];
        int i2 = iArr[1];
        int readUnsignedInt = readBuffer.readUnsignedInt();
        if (readUnsignedInt < 0) {
            LOGGER.warning(INVALID_FIRST_WAY_OFFSET + readUnsignedInt);
            return null;
        }
        int bufferPosition = readUnsignedInt + readBuffer.getBufferPosition();
        if (bufferPosition > readBuffer.getBufferSize()) {
            LOGGER.warning(INVALID_FIRST_WAY_OFFSET + bufferPosition);
            return null;
        }
        boolean z = queryParameters.queryZoomLevel > subFileParameter.baseZoomLevel;
        List<PointOfInterest> processPOIs = processPOIs(d, d2, i, boundingBox, z, readBuffer);
        if (processPOIs == null) {
            return null;
        }
        if (Selector.POIS == selector) {
            processWays = Collections.emptyList();
            list = processPOIs;
        } else {
            if (readBuffer.getBufferPosition() > bufferPosition) {
                LOGGER.warning("invalid buffer position: " + readBuffer.getBufferPosition());
                return null;
            }
            readBuffer.setBufferPosition(bufferPosition);
            list = processPOIs;
            processWays = processWays(queryParameters, i2, boundingBox, z, d, d2, selector, readBuffer);
            if (processWays == null) {
                return null;
            }
        }
        return new PoiWayBundle(list, processWays);
    }

    private boolean processBlockSignature(ReadBuffer readBuffer) {
        if (!this.mapFileHeader.getMapFileInfo().debugFile) {
            return true;
        }
        String readUTF8EncodedString = readBuffer.readUTF8EncodedString(32);
        if (readUTF8EncodedString.startsWith("###TileStart")) {
            return true;
        }
        LOGGER.warning("invalid block signature: " + readUTF8EncodedString);
        return false;
    }

    private MapReadResult processBlocks(QueryParameters queryParameters, SubFileParameter subFileParameter, BoundingBox boundingBox, Selector selector) throws IOException {
        long indexEntry;
        MapReadResult mapReadResult = new MapReadResult();
        boolean z = true;
        for (long j = queryParameters.fromBlockY; j <= queryParameters.toBlockY; j++) {
            long j2 = queryParameters.fromBlockX;
            while (j2 <= queryParameters.toBlockX) {
                long j3 = (subFileParameter.blocksWidth * j) + j2;
                long indexEntry2 = this.databaseIndexCache.getIndexEntry(subFileParameter, j3);
                if (z) {
                    z &= (BITMASK_INDEX_WATER & indexEntry2) != 0;
                }
                boolean z2 = z;
                long j4 = indexEntry2 & BITMASK_INDEX_OFFSET;
                if (j4 < 1 || j4 > subFileParameter.subFileSize) {
                    Logger logger = LOGGER;
                    logger.warning("invalid current block pointer: " + j4);
                    logger.warning("subFileSize: " + subFileParameter.subFileSize);
                    return null;
                }
                long j5 = j3 + 1;
                if (j5 == subFileParameter.numberOfBlocks) {
                    indexEntry = subFileParameter.subFileSize;
                } else {
                    indexEntry = this.databaseIndexCache.getIndexEntry(subFileParameter, j5) & BITMASK_INDEX_OFFSET;
                    if (indexEntry > subFileParameter.subFileSize) {
                        Logger logger2 = LOGGER;
                        logger2.warning("invalid next block pointer: " + indexEntry);
                        logger2.warning("sub-file size: " + subFileParameter.subFileSize);
                        return null;
                    }
                }
                int i = (int) (indexEntry - j4);
                if (i < 0) {
                    LOGGER.warning("current block size must not be negative: " + i);
                    return null;
                }
                if (i != 0) {
                    if (i > Parameters.MAXIMUM_BUFFER_SIZE) {
                        LOGGER.warning("current block size too large: " + i);
                    } else {
                        if (i + j4 > this.fileSize) {
                            LOGGER.warning("current block largher than file size: " + i);
                            return null;
                        }
                        ReadBuffer readBuffer = new ReadBuffer(this.inputChannel);
                        if (!readBuffer.readFromFile(subFileParameter.startAddress + j4, i)) {
                            LOGGER.warning("reading current block has failed: " + i);
                            return null;
                        }
                        try {
                            PoiWayBundle processBlock = processBlock(queryParameters, subFileParameter, boundingBox, MercatorProjection.tileYToLatitude(subFileParameter.boundaryTileTop + j, subFileParameter.baseZoomLevel), MercatorProjection.tileXToLongitude(subFileParameter.boundaryTileLeft + j2, subFileParameter.baseZoomLevel), selector, readBuffer);
                            if (processBlock != null) {
                                mapReadResult.add(processBlock);
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
                        }
                    }
                }
                j2++;
                z = z2;
            }
        }
        return mapReadResult;
    }

    private List<PointOfInterest> processPOIs(double d, double d2, int i, BoundingBox boundingBox, boolean z, ReadBuffer readBuffer) {
        ArrayList arrayList = new ArrayList();
        Tag[] tagArr = this.mapFileHeader.getMapFileInfo().poiTags;
        for (int i2 = i; i2 != 0; i2--) {
            if (this.mapFileHeader.getMapFileInfo().debugFile) {
                String readUTF8EncodedString = readBuffer.readUTF8EncodedString(32);
                if (!readUTF8EncodedString.startsWith("***POIStart")) {
                    LOGGER.warning("invalid POI signature: " + readUTF8EncodedString);
                    return null;
                }
            }
            double microdegreesToDegrees = d + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            double microdegreesToDegrees2 = d2 + LatLongUtils.microdegreesToDegrees(readBuffer.readSignedInt());
            byte readByte = readBuffer.readByte();
            byte b = (byte) ((readByte & 240) >>> 4);
            List<Tag> readTags = readBuffer.readTags(tagArr, (byte) (readByte & Ascii.SI));
            if (readTags == null) {
                return null;
            }
            byte readByte2 = readBuffer.readByte();
            boolean z2 = (readByte2 & 128) != 0;
            boolean z3 = (readByte2 & SignedBytes.MAX_POWER_OF_TWO) != 0;
            boolean z4 = (readByte2 & 32) != 0;
            if (z2) {
                readTags.add(new Tag("name", extractLocalized(readBuffer.readUTF8EncodedString())));
            }
            if (z3) {
                readTags.add(new Tag(TAG_KEY_HOUSE_NUMBER, readBuffer.readUTF8EncodedString()));
            }
            if (z4) {
                readTags.add(new Tag(TAG_KEY_ELE, Integer.toString(readBuffer.readSignedInt())));
            }
            LatLong latLong = new LatLong(microdegreesToDegrees, microdegreesToDegrees2);
            if (!z || boundingBox.contains(latLong)) {
                arrayList.add(new PointOfInterest(b, readTags, latLong));
            }
        }
        return arrayList;
    }

    private LatLong[][] processWayDataBlock(double d, double d2, boolean z, ReadBuffer readBuffer) {
        int readUnsignedInt = readBuffer.readUnsignedInt();
        if (readUnsignedInt < 1 || readUnsignedInt > 32767) {
            LOGGER.warning("invalid number of way coordinate blocks: " + readUnsignedInt);
            return null;
        }
        LatLong[][] latLongArr = new LatLong[readUnsignedInt][];
        for (int i = 0; i < readUnsignedInt; i++) {
            int readUnsignedInt2 = readBuffer.readUnsignedInt();
            if (readUnsignedInt2 < 2 || readUnsignedInt2 > 32767) {
                LOGGER.warning("invalid number of way nodes: " + readUnsignedInt2);
                return null;
            }
            LatLong[] latLongArr2 = new LatLong[readUnsignedInt2];
            if (z) {
                decodeWayNodesDoubleDelta(latLongArr2, d, d2, readBuffer);
            } else {
                decodeWayNodesSingleDelta(latLongArr2, d, d2, readBuffer);
            }
            latLongArr[i] = latLongArr2;
        }
        return latLongArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    private List<Way> processWays(QueryParameters queryParameters, int i, BoundingBox boundingBox, boolean z, double d, double d2, Selector selector, ReadBuffer readBuffer) {
        LatLong latLong;
        ArrayList arrayList = new ArrayList();
        Tag[] tagArr = this.mapFileHeader.getMapFileInfo().wayTags;
        BoundingBox extendMeters = boundingBox.extendMeters(wayFilterDistance);
        for (int i2 = i; i2 != 0; i2--) {
            if (this.mapFileHeader.getMapFileInfo().debugFile) {
                String readUTF8EncodedString = readBuffer.readUTF8EncodedString(32);
                if (!readUTF8EncodedString.startsWith("---WayStart")) {
                    LOGGER.warning("invalid way signature: " + readUTF8EncodedString);
                    return null;
                }
            }
            int readUnsignedInt = readBuffer.readUnsignedInt();
            if (readUnsignedInt < 0) {
                LOGGER.warning("invalid way data size: " + readUnsignedInt);
                return null;
            }
            if (queryParameters.useTileBitmask) {
                if ((readBuffer.readShort() & queryParameters.queryTileBitmask) == 0) {
                    readBuffer.skipBytes(readUnsignedInt - 2);
                }
            } else {
                readBuffer.skipBytes(2);
            }
            byte readByte = readBuffer.readByte();
            byte b = (byte) ((readByte & 240) >>> 4);
            List<Tag> readTags = readBuffer.readTags(tagArr, (byte) (readByte & Ascii.SI));
            if (readTags == null) {
                return null;
            }
            byte readByte2 = readBuffer.readByte();
            boolean z2 = true;
            ?? r17 = (readByte2 & 128) != 0;
            ?? r18 = (readByte2 & SignedBytes.MAX_POWER_OF_TWO) != 0;
            ?? r19 = (readByte2 & 32) != 0;
            ?? r1 = (readByte2 & Ascii.DLE) != 0;
            boolean z3 = (readByte2 & 8) != 0;
            boolean z4 = (readByte2 & 4) != 0;
            if (r17 != false) {
                readTags.add(new Tag("name", extractLocalized(readBuffer.readUTF8EncodedString())));
            }
            if (r18 != false) {
                readTags.add(new Tag(TAG_KEY_HOUSE_NUMBER, readBuffer.readUTF8EncodedString()));
            }
            if (r19 != false) {
                readTags.add(new Tag(TAG_KEY_REF, readBuffer.readUTF8EncodedString()));
            }
            int[] readOptionalLabelPosition = r1 != false ? readOptionalLabelPosition(readBuffer) : null;
            int readOptionalWayDataBlocksByte = readOptionalWayDataBlocksByte(z3, readBuffer);
            if (readOptionalWayDataBlocksByte < 1) {
                LOGGER.warning("invalid number of way data blocks: " + readOptionalWayDataBlocksByte);
                return null;
            }
            int i3 = 0;
            while (i3 < readOptionalWayDataBlocksByte) {
                int i4 = readOptionalWayDataBlocksByte;
                int i5 = i3;
                boolean z5 = z2;
                List<Tag> list = readTags;
                LatLong[][] processWayDataBlock = processWayDataBlock(d, d2, z4, readBuffer);
                if (processWayDataBlock != null && (!z || !wayFilterEnabled || extendMeters.intersectsArea(processWayDataBlock))) {
                    if (Selector.ALL == selector || r17 != false || r18 != false || r19 != false || wayAsLabelTagFilter(list)) {
                        if (readOptionalLabelPosition != null) {
                            latLong = new LatLong(processWayDataBlock[0][0].latitude + LatLongUtils.microdegreesToDegrees(readOptionalLabelPosition[z5 ? 1 : 0]), processWayDataBlock[0][0].longitude + LatLongUtils.microdegreesToDegrees(readOptionalLabelPosition[0]));
                        } else {
                            latLong = null;
                        }
                        arrayList.add(new Way(b, list, processWayDataBlock, latLong));
                    }
                }
                i3 = i5 + 1;
                readTags = list;
                readOptionalWayDataBlocksByte = i4;
                z2 = z5 ? 1 : 0;
            }
        }
        return arrayList;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readLabels(Tile tile) {
        return readMapData(tile, tile, Selector.LABELS);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readLabels(Tile tile, Tile tile2) {
        return readMapData(tile, tile2, Selector.LABELS);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readMapData(Tile tile) {
        return readMapData(tile, tile, Selector.ALL);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readMapData(Tile tile, Tile tile2) {
        return readMapData(tile, tile2, Selector.ALL);
    }

    private MapReadResult readMapData(Tile tile, Tile tile2, Selector selector) {
        if (tile.tileX > tile2.tileX || tile.tileY > tile2.tileY) {
            new IllegalArgumentException("upperLeft tile must be above and left of lowerRight tile");
        }
        try {
            QueryParameters queryParameters = new QueryParameters();
            queryParameters.queryZoomLevel = this.mapFileHeader.getQueryZoomLevel(tile.zoomLevel);
            SubFileParameter subFileParameter = this.mapFileHeader.getSubFileParameter(queryParameters.queryZoomLevel);
            if (subFileParameter == null) {
                LOGGER.warning("no sub-file for zoom level: " + queryParameters.queryZoomLevel);
                return null;
            }
            queryParameters.calculateBaseTiles(tile, tile2, subFileParameter);
            queryParameters.calculateBlocks(subFileParameter);
            return processBlocks(queryParameters, subFileParameter, Tile.getBoundingBox(tile, tile2), selector);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
            return null;
        }
    }

    private int[] readOptionalLabelPosition(ReadBuffer readBuffer) {
        return new int[]{readBuffer.readSignedInt(), readBuffer.readSignedInt()};
    }

    private int readOptionalWayDataBlocksByte(boolean z, ReadBuffer readBuffer) {
        if (z) {
            return readBuffer.readUnsignedInt();
        }
        return 1;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readPoiData(Tile tile) {
        return readMapData(tile, tile, Selector.POIS);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readPoiData(Tile tile, Tile tile2) {
        return readMapData(tile, tile2, Selector.POIS);
    }

    private int[][] readZoomTable(SubFileParameter subFileParameter, ReadBuffer readBuffer) {
        int i = (subFileParameter.zoomLevelMax - subFileParameter.zoomLevelMin) + 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 2);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i2 += readBuffer.readUnsignedInt();
            i3 += readBuffer.readUnsignedInt();
            int[] iArr2 = iArr[i4];
            iArr2[0] = i2;
            iArr2[1] = i3;
        }
        return iArr;
    }

    public void restrictToZoomRange(byte b, byte b2) {
        this.zoomLevelMax = b2;
        this.zoomLevelMin = b;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public LatLong startPosition() {
        if (getMapFileInfo().startPosition != null) {
            return getMapFileInfo().startPosition;
        }
        return getMapFileInfo().boundingBox.getCenterPoint();
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public Byte startZoomLevel() {
        if (getMapFileInfo().startZoomLevel != null) {
            return getMapFileInfo().startZoomLevel;
        }
        return (byte) 12;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public boolean supportsTile(Tile tile) {
        return tile.getBoundingBox().intersects(getMapFileInfo().boundingBox) && tile.zoomLevel >= this.zoomLevelMin && tile.zoomLevel <= this.zoomLevelMax;
    }
}
