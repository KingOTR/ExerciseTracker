package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import com.google.firebase.firestore.model.Values;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalh {
    private static final char[] zza;

    static String zza(zzalc zzalcVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        zza(zzalcVar, sb, 0);
        return sb.toString();
    }

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(zzamh.zza(zzaip.zza((String) obj))).append('\"');
            return;
        }
        if (obj instanceof zzaip) {
            sb.append(": \"").append(zzamh.zza((zzaip) obj)).append('\"');
            return;
        }
        if (obj instanceof zzajy) {
            sb.append(" {");
            zza((zzajy) obj, sb, i + 2);
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, DatabaseFileArchive.COLUMN_KEY, entry.getKey());
            zza(sb, i3, Values.VECTOR_MAP_VECTORS_KEY, entry.getValue());
            sb.append("\n");
            zza(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ").append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a9, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bb, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d1, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzalc zzalcVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zza(sb, i, substring.substring(0, substring.length() - 4), zzajy.zza(method2, zzalcVar, new Object[0]));
                i2 = 3;
            } else {
                if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    zza(sb, i, substring.substring(0, substring.length() - 3), zzajy.zza(method, zzalcVar, new Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set" + substring)) {
                        if (substring.endsWith("Bytes")) {
                        }
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has" + substring);
                        if (method4 != null) {
                            Object zza2 = zzajy.zza(method4, zzalcVar, new Object[0]);
                            if (method5 == null) {
                                booleanValue = true;
                                if (!(zza2 instanceof Boolean)) {
                                    if (!(zza2 instanceof Integer)) {
                                        if (!(zza2 instanceof Float)) {
                                            if (!(zza2 instanceof Double)) {
                                                if (zza2 instanceof String) {
                                                    equals = zza2.equals("");
                                                } else if (zza2 instanceof zzaip) {
                                                    equals = zza2.equals(zzaip.zza);
                                                } else {
                                                    equals = !(zza2 instanceof zzalc) ? false : false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (equals) {
                                    booleanValue = false;
                                }
                            } else {
                                booleanValue = ((Boolean) zzajy.zza(method5, zzalcVar, new Object[0])).booleanValue();
                            }
                            if (booleanValue) {
                                zza(sb, i, substring, zza2);
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (zzalcVar instanceof zzajy.zzb) {
            Iterator<Map.Entry<zzajy.zze, Object>> zzd = ((zzajy.zzb) zzalcVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzajy zzajyVar = (zzajy) zzalcVar;
        if (zzajyVar.zzb != null) {
            zzajyVar.zzb.zza(sb, i);
        }
    }
}
