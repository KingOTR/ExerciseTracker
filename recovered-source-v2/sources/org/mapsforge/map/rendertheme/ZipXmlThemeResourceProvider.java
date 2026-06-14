package org.mapsforge.map.rendertheme;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.mapsforge.core.util.IOUtils;

/* loaded from: classes5.dex */
public class ZipXmlThemeResourceProvider implements XmlThemeResourceProvider {
    private final Map<String, byte[]> files;
    private final List<String> xmlThemes;

    public ZipXmlThemeResourceProvider(ZipInputStream zipInputStream) throws IOException {
        this(zipInputStream, Integer.MAX_VALUE);
    }

    public ZipXmlThemeResourceProvider(ZipInputStream zipInputStream, int i) throws IOException {
        this.files = new HashMap();
        this.xmlThemes = new ArrayList();
        if (zipInputStream == null) {
            return;
        }
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return;
                }
                if (!nextEntry.isDirectory() && nextEntry.getSize() <= i) {
                    byte[] streamToBytes = streamToBytes(zipInputStream, (int) nextEntry.getSize());
                    String zipEntryName = zipEntryName(nextEntry.getName());
                    this.files.put(zipEntryName, streamToBytes);
                    if (isXmlTheme(zipEntryName)) {
                        this.xmlThemes.add(zipEntryName);
                    }
                }
            } finally {
                IOUtils.closeQuietly(zipInputStream);
            }
        }
    }

    @Override // org.mapsforge.map.rendertheme.XmlThemeResourceProvider
    public InputStream createInputStream(String str, String str2) {
        if (str2.startsWith(XmlUtils.PREFIX_FILE)) {
            str2 = str2.substring(XmlUtils.PREFIX_FILE.length());
        }
        if (str2.startsWith(DomExceptionUtils.SEPARATOR)) {
            str2 = str2.substring(1);
        }
        if (str != null) {
            if (str.startsWith(DomExceptionUtils.SEPARATOR)) {
                str = str.substring(1);
            }
            if (str.endsWith(DomExceptionUtils.SEPARATOR)) {
                str = str.substring(0, str.length() - 1);
            }
            if (!str.isEmpty()) {
                str2 = str + DomExceptionUtils.SEPARATOR + str2;
            }
        }
        if (this.files.containsKey(str2)) {
            return new ByteArrayInputStream(this.files.get(str2));
        }
        return null;
    }

    public int getCount() {
        return this.files.size();
    }

    public List<String> getXmlThemes() {
        return this.xmlThemes;
    }

    private static boolean isXmlTheme(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".xml");
    }

    public static List<String> scanXmlThemes(ZipInputStream zipInputStream) throws IOException {
        if (zipInputStream == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return arrayList;
                }
                if (!nextEntry.isDirectory()) {
                    String zipEntryName = zipEntryName(nextEntry.getName());
                    if (isXmlTheme(zipEntryName)) {
                        arrayList.add(zipEntryName);
                    }
                }
            } finally {
                IOUtils.closeQuietly(zipInputStream);
            }
        }
    }

    private static byte[] streamToBytes(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr, i2, i);
            if (read <= 0) {
                return bArr;
            }
            i -= read;
            i2 += read;
        }
    }

    private static String zipEntryName(String str) {
        return str.startsWith(DomExceptionUtils.SEPARATOR) ? str.substring(1) : str;
    }
}
