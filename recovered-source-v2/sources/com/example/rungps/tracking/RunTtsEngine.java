package com.example.rungps.tracking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RunTtsEngine.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/example/rungps/tracking/RunTtsEngine;", "", "<init>", "()V", "TAG", "", "GOOGLE_TTS", "ready", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tts", "Landroid/speech/tts/TextToSpeech;", "pending", "Ljava/util/ArrayList;", "Lcom/example/rungps/tracking/RunTtsEngine$PendingSpeech;", "Lkotlin/collections/ArrayList;", "speak", "", "context", "Landroid/content/Context;", "text", "flush", "", "shutdown", "configure", "engine", "preferredEnginePackage", "onInit", NotificationCompat.CATEGORY_STATUS, "", "deliver", "speechLocale", "Ljava/util/Locale;", "pickVoice", "Landroid/speech/tts/Voice;", "locale", "PendingSpeech", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunTtsEngine {
    private static final String GOOGLE_TTS = "com.google.android.tts";
    private static final String TAG = "RunTtsEngine";
    private static TextToSpeech tts;
    public static final RunTtsEngine INSTANCE = new RunTtsEngine();
    private static final AtomicBoolean ready = new AtomicBoolean(false);
    private static final ArrayList<PendingSpeech> pending = new ArrayList<>();
    public static final int $stable = 8;

    private RunTtsEngine() {
    }

    /* compiled from: RunTtsEngine.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/tracking/RunTtsEngine$PendingSpeech;", "", "text", "", "flush", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getFlush", "()Z", "component1", "component2", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PendingSpeech {
        private final boolean flush;
        private final String text;

        public static /* synthetic */ PendingSpeech copy$default(PendingSpeech pendingSpeech, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingSpeech.text;
            }
            if ((i & 2) != 0) {
                z = pendingSpeech.flush;
            }
            return pendingSpeech.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFlush() {
            return this.flush;
        }

        public final PendingSpeech copy(String text, boolean flush) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new PendingSpeech(text, flush);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingSpeech)) {
                return false;
            }
            PendingSpeech pendingSpeech = (PendingSpeech) other;
            return Intrinsics.areEqual(this.text, pendingSpeech.text) && this.flush == pendingSpeech.flush;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.flush);
        }

        public String toString() {
            return "PendingSpeech(text=" + this.text + ", flush=" + this.flush + ")";
        }

        public PendingSpeech(String text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.flush = z;
        }

        public final boolean getFlush() {
            return this.flush;
        }

        public final String getText() {
            return this.text;
        }
    }

    public static /* synthetic */ void speak$default(RunTtsEngine runTtsEngine, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        runTtsEngine.speak(context, str, z);
    }

    public final void speak(Context context, String text, boolean flush) {
        TextToSpeech textToSpeech;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        String obj = StringsKt.trim((CharSequence) text).toString();
        if (obj.length() == 0) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        TextToSpeech textToSpeech2 = tts;
        if (textToSpeech2 != null && ready.get()) {
            deliver(textToSpeech2, obj, flush);
            return;
        }
        ArrayList<PendingSpeech> arrayList = pending;
        synchronized (arrayList) {
            arrayList.add(new PendingSpeech(obj, flush));
        }
        if (textToSpeech2 != null) {
            return;
        }
        Intrinsics.checkNotNull(applicationContext);
        String preferredEnginePackage = preferredEnginePackage(applicationContext);
        Log.i(TAG, "Initializing TTS engine: " + (preferredEnginePackage == null ? "default" : preferredEnginePackage));
        if (preferredEnginePackage != null) {
            textToSpeech = new TextToSpeech(applicationContext, new TextToSpeech.OnInitListener() { // from class: com.example.rungps.tracking.RunTtsEngine$$ExternalSyntheticLambda0
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    RunTtsEngine.speak$lambda$1(i);
                }
            }, preferredEnginePackage);
        } else {
            textToSpeech = new TextToSpeech(applicationContext, new TextToSpeech.OnInitListener() { // from class: com.example.rungps.tracking.RunTtsEngine$$ExternalSyntheticLambda1
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    RunTtsEngine.speak$lambda$2(i);
                }
            });
        }
        tts = textToSpeech;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speak$lambda$1(int i) {
        INSTANCE.onInit(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speak$lambda$2(int i) {
        INSTANCE.onInit(i);
    }

    public final void shutdown() {
        ArrayList<PendingSpeech> arrayList = pending;
        synchronized (arrayList) {
            arrayList.clear();
            Unit unit = Unit.INSTANCE;
        }
        ready.set(false);
        TextToSpeech textToSpeech = tts;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        tts = null;
    }

    public final boolean configure(TextToSpeech engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        engine.setSpeechRate(1.22f);
        engine.setPitch(1.0f);
        engine.setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build());
        Locale speechLocale = speechLocale();
        int language = engine.setLanguage(speechLocale);
        if (language == -2 || language == -1) {
            language = engine.setLanguage(Locale.US);
        }
        Voice pickVoice = pickVoice(engine, speechLocale);
        if (pickVoice != null) {
            engine.setVoice(pickVoice);
            Log.i(TAG, "Voice: " + pickVoice.getName() + " (" + pickVoice.getLocale() + ")");
        }
        return (language == -1 || language == -2) ? false : true;
    }

    public final String preferredEnginePackage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.intent.action.TTS_SERVICE"), 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
            String str = serviceInfo != null ? serviceInfo.packageName : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        List distinct = CollectionsKt.distinct(arrayList);
        if (distinct.contains(GOOGLE_TTS)) {
            return GOOGLE_TTS;
        }
        return (String) CollectionsKt.firstOrNull(distinct);
    }

    private final void onInit(int status) {
        List<PendingSpeech> list;
        TextToSpeech textToSpeech = tts;
        if (textToSpeech == null) {
            return;
        }
        if (status != 0) {
            Log.w(TAG, "TTS init failed: " + status);
            ArrayList<PendingSpeech> arrayList = pending;
            synchronized (arrayList) {
                arrayList.clear();
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        configure(textToSpeech);
        ready.set(true);
        ArrayList<PendingSpeech> arrayList2 = pending;
        synchronized (arrayList2) {
            list = CollectionsKt.toList(arrayList2);
            arrayList2.clear();
        }
        for (PendingSpeech pendingSpeech : list) {
            deliver(textToSpeech, pendingSpeech.getText(), pendingSpeech.getFlush());
        }
    }

    private final void deliver(TextToSpeech engine, String text, boolean flush) {
        engine.speak(text, !flush ? 1 : 0, null, "run-cue-" + System.nanoTime());
    }

    private final Locale speechLocale() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = language.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "en")) {
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
            if (country.length() <= 0) {
                locale = Locale.US;
            }
            Intrinsics.checkNotNull(locale);
        } else {
            Intrinsics.checkNotNull(locale);
        }
        return locale;
    }

    private final Voice pickVoice(TextToSpeech engine, final Locale locale) {
        Set<Voice> voices = engine.getVoices();
        if (voices == null) {
            return null;
        }
        String language = locale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = language.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : voices) {
            Voice voice = (Voice) obj;
            String language2 = voice.getLocale().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = language2.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase2, lowerCase) && !voice.isNetworkConnectionRequired()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Voice voice2 = (Voice) obj2;
            String name = voice2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!StringsKt.contains((CharSequence) name, (CharSequence) ImagesContract.LOCAL, true)) {
                String name2 = voice2.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.contains((CharSequence) name2, (CharSequence) "-local", true)) {
                }
            }
            arrayList3.add(obj2);
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            arrayList2 = arrayList4;
        }
        final Comparator comparator = new Comparator() { // from class: com.example.rungps.tracking.RunTtsEngine$pickVoice$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((Voice) t).getQuality()), Integer.valueOf(((Voice) t2).getQuality()));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.example.rungps.tracking.RunTtsEngine$pickVoice$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                return ComparisonsKt.compareValues(StringsKt.equals(((Voice) t).getLocale().getCountry(), locale.getCountry(), true) ? 1 : 0, StringsKt.equals(((Voice) t2).getLocale().getCountry(), locale.getCountry(), true) ? 1 : 0);
            }
        };
        return (Voice) CollectionsKt.maxWithOrNull(arrayList2, new Comparator() { // from class: com.example.rungps.tracking.RunTtsEngine$pickVoice$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator2.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                String name3 = ((Voice) t).getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                Integer num = StringsKt.contains((CharSequence) name3, (CharSequence) "en-us", true) ? 1 : 0;
                String name4 = ((Voice) t2).getName();
                Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                return ComparisonsKt.compareValues(num, StringsKt.contains((CharSequence) name4, (CharSequence) "en-us", true) ? 1 : 0);
            }
        });
    }
}
