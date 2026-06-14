package org.osmdroid.tileprovider.tilesource.bing;

import android.content.Context;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.IStyledTileSource;
import org.osmdroid.tileprovider.tilesource.QuadTreeTileSource;
import org.osmdroid.tileprovider.util.ManifestUtil;
import org.osmdroid.tileprovider.util.StreamUtils;

/* loaded from: classes5.dex */
public class BingMapTileSource extends QuadTreeTileSource implements IStyledTileSource<String> {
    private static final String BASE_URL_PATTERN = "https://dev.virtualearth.net/REST/V1/Imagery/Metadata/%s?mapVersion=v1&output=json&uriScheme=https&key=%s";
    private static final String BING_KEY = "BING_KEY";
    private static final String FILENAME_ENDING = ".jpeg";
    public static final String IMAGERYSET_AERIAL = "Aerial";
    public static final String IMAGERYSET_AERIALWITHLABELS = "AerialWithLabels";
    public static final String IMAGERYSET_ROAD = "Road";
    private static String mBingMapKey = "";
    private String mBaseUrl;
    private ImageryMetaDataResource mImageryData;
    private String mLocale;
    private String mStyle;
    private String mUrl;

    public BingMapTileSource(String str) {
        super("BingMaps", 0, 19, 256, FILENAME_ENDING, null);
        this.mStyle = IMAGERYSET_ROAD;
        this.mImageryData = ImageryMetaDataResource.getDefaultInstance();
        this.mLocale = str;
        if (str == null) {
            this.mLocale = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
        }
    }

    public static void retrieveBingKey(Context context) {
        mBingMapKey = ManifestUtil.retrieveKey(context, BING_KEY);
    }

    public static String getBingKey() {
        return mBingMapKey;
    }

    public static void setBingKey(String str) {
        mBingMapKey = str;
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getBaseUrl() {
        if (!this.mImageryData.m_isInitialised) {
            initMetaData();
        }
        return this.mBaseUrl;
    }

    @Override // org.osmdroid.tileprovider.tilesource.QuadTreeTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j) {
        if (!this.mImageryData.m_isInitialised) {
            initMetaData();
        }
        return String.format(this.mUrl, quadTree(j));
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getMinimumZoomLevel() {
        return this.mImageryData.m_zoomMin;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getMaximumZoomLevel() {
        return this.mImageryData.m_zoomMax;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public int getTileSizePixels() {
        return this.mImageryData.m_imageHeight;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase
    public String pathBase() {
        return this.mName + this.mStyle;
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, org.osmdroid.tileprovider.tilesource.ITileSource
    public String getCopyrightNotice() {
        return this.mImageryData.copyright;
    }

    @Override // org.osmdroid.tileprovider.tilesource.IStyledTileSource
    public void setStyle(String str) {
        if (!str.equals(this.mStyle)) {
            synchronized (this.mStyle) {
                this.mUrl = null;
                this.mBaseUrl = null;
                this.mImageryData.m_isInitialised = false;
            }
        }
        this.mStyle = str;
        this.mName = pathBase();
    }

    @Override // org.osmdroid.tileprovider.tilesource.IStyledTileSource
    public String getStyle() {
        return this.mStyle;
    }

    public ImageryMetaDataResource initMetaData() {
        ImageryMetaDataResource metaData;
        if (!this.mImageryData.m_isInitialised) {
            synchronized (this) {
                if (!this.mImageryData.m_isInitialised && (metaData = getMetaData()) != null) {
                    this.mImageryData = metaData;
                    updateBaseUrl();
                }
            }
        }
        return this.mImageryData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImageryMetaDataResource getMetaData() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r6;
        HttpURLConnection httpURLConnection;
        ?? r5;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        BufferedOutputStream bufferedOutputStream;
        ImageryMetaDataResource instanceFromJSON;
        Log.d(IMapView.LOGTAG, "getMetaData");
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(String.format(BASE_URL_PATTERN, this.mStyle, mBingMapKey)).openConnection();
            try {
                Log.d(IMapView.LOGTAG, "make request " + httpURLConnection.getURL().toString().toString());
                httpURLConnection.setRequestProperty(Configuration.getInstance().getUserAgentHttpHeader(), Configuration.getInstance().getUserAgentValue());
                for (Map.Entry<String, String> entry : Configuration.getInstance().getAdditionalHttpRequestProperties().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    Log.e(IMapView.LOGTAG, "Cannot get response for url " + httpURLConnection.getURL().toString() + " " + httpURLConnection.getResponseMessage());
                    instanceFromJSON = null;
                    byteArrayOutputStream2 = null;
                    bufferedOutputStream = null;
                } else {
                    InputStream inputStream3 = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                    } catch (Exception e) {
                        r5 = 0;
                        r6 = null;
                        inputStream = inputStream3;
                        e = e;
                    } catch (Throwable th) {
                        byteArrayOutputStream = null;
                        r6 = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = inputStream3;
                        th = th;
                    }
                    try {
                        bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream2, 8192);
                        try {
                            StreamUtils.copy(inputStream3, bufferedOutputStream);
                            bufferedOutputStream.flush();
                            inputStream2 = inputStream3;
                            instanceFromJSON = ImageryMetaData.getInstanceFromJSON(byteArrayOutputStream2.toString());
                        } catch (Exception e2) {
                            byteArrayOutputStream3 = byteArrayOutputStream2;
                            inputStream = inputStream3;
                            e = e2;
                            r6 = bufferedOutputStream;
                            r5 = byteArrayOutputStream3;
                            try {
                                Log.e(IMapView.LOGTAG, "Error getting imagery meta data", e);
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception e3) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e3);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e4) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e4);
                                    }
                                }
                                if (r5 != 0) {
                                    try {
                                        r5.close();
                                    } catch (Exception e5) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e5);
                                    }
                                }
                                if (r6 != null) {
                                    try {
                                        r6.close();
                                    } catch (Exception e6) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e6);
                                    }
                                }
                                Log.d(IMapView.LOGTAG, "end getMetaData");
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                httpURLConnection2 = httpURLConnection;
                                byteArrayOutputStream = r5;
                                if (httpURLConnection2 != null) {
                                    try {
                                        httpURLConnection2.disconnect();
                                    } catch (Exception e7) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e7);
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e8) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e8);
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception e9) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e9);
                                    }
                                }
                                if (r6 != null) {
                                    try {
                                        r6.close();
                                    } catch (Exception e10) {
                                        Log.d(IMapView.LOGTAG, "end getMetaData", e10);
                                    }
                                }
                                Log.d(IMapView.LOGTAG, "end getMetaData");
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r6 = bufferedOutputStream;
                            r5 = byteArrayOutputStream2;
                            inputStream = inputStream3;
                            th = th3;
                            httpURLConnection2 = httpURLConnection;
                            byteArrayOutputStream = r5;
                            if (httpURLConnection2 != null) {
                            }
                            if (inputStream != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            if (r6 != null) {
                            }
                            Log.d(IMapView.LOGTAG, "end getMetaData");
                            throw th;
                        }
                    } catch (Exception e11) {
                        r6 = null;
                        byteArrayOutputStream3 = byteArrayOutputStream2;
                        inputStream = inputStream3;
                        e = e11;
                    } catch (Throwable th4) {
                        r6 = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream = inputStream3;
                        th = th4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (httpURLConnection2 != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        if (r6 != null) {
                        }
                        Log.d(IMapView.LOGTAG, "end getMetaData");
                        throw th;
                    }
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e12) {
                        Log.d(IMapView.LOGTAG, "end getMetaData", e12);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e13) {
                        Log.d(IMapView.LOGTAG, "end getMetaData", e13);
                    }
                }
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e14) {
                        Log.d(IMapView.LOGTAG, "end getMetaData", e14);
                    }
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception e15) {
                        Log.d(IMapView.LOGTAG, "end getMetaData", e15);
                    }
                }
                Log.d(IMapView.LOGTAG, "end getMetaData");
                return instanceFromJSON;
            } catch (Exception e16) {
                e = e16;
                inputStream = null;
                InputStream inputStream4 = inputStream;
                r6 = inputStream4;
                r5 = inputStream4;
                Log.e(IMapView.LOGTAG, "Error getting imagery meta data", e);
                if (httpURLConnection != null) {
                }
                if (inputStream != null) {
                }
                if (r5 != 0) {
                }
                if (r6 != null) {
                }
                Log.d(IMapView.LOGTAG, "end getMetaData");
                return null;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                r5 = 0;
                r6 = null;
            }
        } catch (Exception e17) {
            e = e17;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            byteArrayOutputStream = null;
            r6 = null;
        }
    }

    protected void updateBaseUrl() {
        Log.d(IMapView.LOGTAG, "updateBaseUrl");
        String subDomain = this.mImageryData.getSubDomain();
        int lastIndexOf = this.mImageryData.m_imageUrl.lastIndexOf(DomExceptionUtils.SEPARATOR);
        if (lastIndexOf > 0) {
            this.mBaseUrl = this.mImageryData.m_imageUrl.substring(0, lastIndexOf);
        } else {
            this.mBaseUrl = this.mImageryData.m_imageUrl;
        }
        this.mUrl = this.mImageryData.m_imageUrl;
        if (subDomain != null) {
            this.mBaseUrl = String.format(this.mBaseUrl, subDomain);
            this.mUrl = String.format(this.mUrl, subDomain, "%s", this.mLocale);
        }
        Log.d(IMapView.LOGTAG, "updated url = " + this.mUrl);
        Log.d(IMapView.LOGTAG, "end updateBaseUrl");
    }
}
