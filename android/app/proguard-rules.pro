# Full app import from v0.7.93 decompiled sources
-keep class com.example.rungps.** { *; }
-keep class com.exercisetracker.app.** { *; }

-keepattributes *Annotation*, Signature, InnerClasses, EnclosingMethod

# Firebase
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }

# Room
-keep class * extends androidx.room.RoomDatabase
-keep @androidx.room.Entity class *

# MapLibre / osmdroid
-keep class org.maplibre.** { *; }
-keep class org.osmdroid.** { *; }

# TensorFlow Lite
-keep class org.tensorflow.lite.** { *; }

# Kotlin serialization
-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations
-keepclassmembers class kotlinx.serialization.json.** { *; }

# Health Connect
-keep class androidx.health.connect.** { *; }

-dontwarn org.bouncycastle.**
-dontwarn org.conscrypt.**
-dontwarn org.openjsse.**
