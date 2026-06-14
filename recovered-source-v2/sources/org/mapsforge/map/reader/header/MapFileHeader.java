package org.mapsforge.map.reader.header;

import java.io.IOException;
import org.mapsforge.map.reader.ReadBuffer;

/* loaded from: classes5.dex */
public class MapFileHeader {
    private static final int BASE_ZOOM_LEVEL_MAX = 20;
    private static final int HEADER_SIZE_MIN = 70;
    private static final byte SIGNATURE_LENGTH_INDEX = 16;
    private static final char SPACE = ' ';
    private MapFileInfo mapFileInfo;
    private SubFileParameter[] subFileParameters;
    private byte zoomLevelMaximum;
    private byte zoomLevelMinimum;

    public MapFileInfo getMapFileInfo() {
        return this.mapFileInfo;
    }

    public byte getQueryZoomLevel(byte b) {
        byte b2 = this.zoomLevelMaximum;
        if (b > b2) {
            return b2;
        }
        byte b3 = this.zoomLevelMinimum;
        return b < b3 ? b3 : b;
    }

    public SubFileParameter getSubFileParameter(int i) {
        return this.subFileParameters[i];
    }

    public void readHeader(ReadBuffer readBuffer, long j) throws IOException {
        RequiredFields.readMagicByte(readBuffer);
        RequiredFields.readRemainingHeader(readBuffer);
        MapFileInfoBuilder mapFileInfoBuilder = new MapFileInfoBuilder();
        RequiredFields.readFileVersion(readBuffer, mapFileInfoBuilder);
        RequiredFields.readFileSize(readBuffer, j, mapFileInfoBuilder);
        RequiredFields.readMapDate(readBuffer, mapFileInfoBuilder);
        RequiredFields.readBoundingBox(readBuffer, mapFileInfoBuilder);
        RequiredFields.readTilePixelSize(readBuffer, mapFileInfoBuilder);
        RequiredFields.readProjectionName(readBuffer, mapFileInfoBuilder);
        OptionalFields.readOptionalFields(readBuffer, mapFileInfoBuilder);
        RequiredFields.readPoiTags(readBuffer, mapFileInfoBuilder);
        RequiredFields.readWayTags(readBuffer, mapFileInfoBuilder);
        readSubFileParameters(readBuffer, j, mapFileInfoBuilder);
        this.mapFileInfo = mapFileInfoBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readSubFileParameters(ReadBuffer readBuffer, long j, MapFileInfoBuilder mapFileInfoBuilder) {
        int readByte = readBuffer.readByte();
        if (readByte < 1) {
            throw new MapFileException("invalid number of sub-files: " + readByte);
        }
        mapFileInfoBuilder.numberOfSubFiles = readByte;
        SubFileParameter[] subFileParameterArr = new SubFileParameter[readByte];
        this.zoomLevelMinimum = Byte.MAX_VALUE;
        this.zoomLevelMaximum = Byte.MIN_VALUE;
        for (byte b = 0; b < readByte; b = (byte) (b + 1)) {
            SubFileParameterBuilder subFileParameterBuilder = new SubFileParameterBuilder();
            byte readByte2 = readBuffer.readByte();
            if (readByte2 < 0 || readByte2 > 20) {
                throw new MapFileException("invalid base zoom level: " + ((int) readByte2));
            }
            subFileParameterBuilder.baseZoomLevel = readByte2;
            byte readByte3 = readBuffer.readByte();
            if (readByte3 < 0 || readByte3 > 22) {
                throw new MapFileException("invalid minimum zoom level: " + ((int) readByte3));
            }
            subFileParameterBuilder.zoomLevelMin = readByte3;
            byte readByte4 = readBuffer.readByte();
            if (readByte4 < 0 || readByte4 > 22) {
                throw new MapFileException("invalid maximum zoom level: " + ((int) readByte4));
            }
            subFileParameterBuilder.zoomLevelMax = readByte4;
            if (readByte3 > readByte4) {
                throw new MapFileException("invalid zoom level range: " + ((int) readByte3) + SPACE + ((int) readByte4));
            }
            long readLong = readBuffer.readLong();
            if (readLong < 70 || readLong >= j) {
                throw new MapFileException("invalid start address: " + readLong);
            }
            subFileParameterBuilder.startAddress = readLong;
            if (mapFileInfoBuilder.optionalFields.isDebugFile) {
                readLong += 16;
            }
            subFileParameterBuilder.indexStartAddress = readLong;
            long readLong2 = readBuffer.readLong();
            if (readLong2 < 1) {
                throw new MapFileException("invalid sub-file size: " + readLong2);
            }
            subFileParameterBuilder.subFileSize = readLong2;
            subFileParameterBuilder.boundingBox = mapFileInfoBuilder.boundingBox;
            SubFileParameter build = subFileParameterBuilder.build();
            subFileParameterArr[b] = build;
            if (this.zoomLevelMinimum > build.zoomLevelMin) {
                byte b2 = subFileParameterArr[b].zoomLevelMin;
                this.zoomLevelMinimum = b2;
                mapFileInfoBuilder.zoomLevelMin = b2;
            }
            if (this.zoomLevelMaximum < subFileParameterArr[b].zoomLevelMax) {
                byte b3 = subFileParameterArr[b].zoomLevelMax;
                this.zoomLevelMaximum = b3;
                mapFileInfoBuilder.zoomLevelMax = b3;
            }
        }
        this.subFileParameters = new SubFileParameter[this.zoomLevelMaximum + 1];
        for (int i = 0; i < readByte; i++) {
            SubFileParameter subFileParameter = subFileParameterArr[i];
            for (byte b4 = subFileParameter.zoomLevelMin; b4 <= subFileParameter.zoomLevelMax; b4 = (byte) (b4 + 1)) {
                this.subFileParameters[b4] = subFileParameter;
            }
        }
    }
}
