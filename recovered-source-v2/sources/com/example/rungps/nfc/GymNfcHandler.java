package com.example.rungps.nfc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Parcelable;
import com.example.rungps.tracking.TrackingService;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: GymNfcHandler.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0005J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020!J\u0016\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010'\u001a\u00020(J\u0015\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020!J,\u0010/\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00100\u001a\u00020\u001dJ*\u00101\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00102\u001a\u00020\u001dJ*\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00102\u001a\u00020\u001dJ*\u00104\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH\u0002J\u0012\u00105\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u00106\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/example/rungps/nfc/GymNfcHandler;", "", "<init>", "()V", "PREFS", "", "KEY_ACTION", "KEY_OPEN_TAB", "KEY_FOCUS_SESSION_ID", "parseUri", "uri", "Landroid/net/Uri;", "formatTagId", "id", "", "uidFromIntent", "intent", "Landroid/content/Intent;", "parseNdefIntent", "parseNdefMessage", "message", "Landroid/nfc/NdefMessage;", "readNdefActionFromTag", "tag", "Landroid/nfc/Tag;", "tagResultForAction", "Lcom/example/rungps/nfc/GymNfcHandler$TagResult;", "action", "hasOpenSession", "", "setPending", "", "context", "Landroid/content/Context;", "consumePending", "requestOpenTab", "tab", "clearOpenTab", "requestFocusGymSession", "sessionId", "", "consumeFocusGymSession", "(Landroid/content/Context;)Ljava/lang/Long;", "isLauncherMainIntent", "stashOpenTabFromIntent", "clearStaleDeepLinks", "consumeOpenTab", "handleTagDiscoveryIntent", "allowBackground", "handleReaderTag", "foreground", "handleRegisteredTag", "processMembershipTag", "parseIntentAction", "handleIntent", "TagResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcHandler {
    public static final int $stable = 0;
    public static final GymNfcHandler INSTANCE = new GymNfcHandler();
    private static final String KEY_ACTION = "pending_action";
    private static final String KEY_FOCUS_SESSION_ID = "focus_gym_session_id";
    private static final String KEY_OPEN_TAB = "open_tab";
    public static final String PREFS = "gym_nfc";

    private GymNfcHandler() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GymNfcHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/nfc/GymNfcHandler$TagResult;", "", "<init>", "(Ljava/lang/String;I)V", "REGISTERED", "ASK_START", "ASK_FINISH", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TagResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TagResult[] $VALUES;
        public static final TagResult REGISTERED = new TagResult("REGISTERED", 0);
        public static final TagResult ASK_START = new TagResult("ASK_START", 1);
        public static final TagResult ASK_FINISH = new TagResult("ASK_FINISH", 2);

        private static final /* synthetic */ TagResult[] $values() {
            return new TagResult[]{REGISTERED, ASK_START, ASK_FINISH};
        }

        public static EnumEntries<TagResult> getEntries() {
            return $ENTRIES;
        }

        private TagResult(String str, int i) {
        }

        static {
            TagResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static TagResult valueOf(String str) {
            return (TagResult) Enum.valueOf(TagResult.class, str);
        }

        public static TagResult[] values() {
            return (TagResult[]) $VALUES.clone();
        }
    }

    public final String parseUri(Uri uri) {
        String str;
        String trim;
        String str2 = null;
        if (uri == null || !Intrinsics.areEqual(uri.getScheme(), "rungps") || !Intrinsics.areEqual(uri.getHost(), "gym")) {
            return null;
        }
        String path = uri.getPath();
        if (path == null || (trim = StringsKt.trim(path, '/')) == null) {
            str = null;
        } else {
            str = trim.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        if (!Intrinsics.areEqual(str, "start")) {
            if (Intrinsics.areEqual(str, "finish")) {
                return "finish";
            }
            return null;
        }
        String queryParameter = uri.getQueryParameter("mode");
        if (queryParameter != null) {
            str2 = queryParameter.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
        }
        return Intrinsics.areEqual(str2, TrackingService.PLAN_FREE_RUN) ? "start_free" : "start_next";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatTagId$lambda$0(byte b) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String formatTagId(byte[] id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return ArraysKt.joinToString$default(id, (CharSequence) ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.rungps.nfc.GymNfcHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence formatTagId$lambda$0;
                formatTagId$lambda$0 = GymNfcHandler.formatTagId$lambda$0(((Byte) obj).byteValue());
                return formatTagId$lambda$0;
            }
        }, 30, (Object) null);
    }

    public final String uidFromIntent(Intent intent) {
        Tag tag;
        if (intent == null || (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG", Tag.class)) == null) {
            return null;
        }
        byte[] id = tag.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        return formatTagId(id);
    }

    public final String parseNdefIntent(Intent intent) {
        Parcelable[] parcelableArrayExtra;
        String parseNdefMessage;
        if (intent == null || (parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")) == null) {
            return null;
        }
        for (Parcelable parcelable : parcelableArrayExtra) {
            NdefMessage ndefMessage = parcelable instanceof NdefMessage ? (NdefMessage) parcelable : null;
            if (ndefMessage != null && (parseNdefMessage = parseNdefMessage(ndefMessage)) != null) {
                return parseNdefMessage;
            }
        }
        return null;
    }

    public final String parseNdefMessage(NdefMessage message) {
        Object m7905constructorimpl;
        String parseUri;
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator it = ArrayIteratorKt.iterator(message.getRecords());
        while (it.hasNext()) {
            NdefRecord ndefRecord = (NdefRecord) it.next();
            if (ndefRecord.getTnf() == 1 && Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_URI) && (parseUri = parseUri(ndefRecord.toUri())) != null) {
                return parseUri;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                GymNfcHandler gymNfcHandler = this;
                byte[] payload = ndefRecord.getPayload();
                Intrinsics.checkNotNullExpressionValue(payload, "getPayload(...)");
                m7905constructorimpl = Result.m7905constructorimpl(new String(payload, Charsets.UTF_8));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = "";
            }
            String obj = StringsKt.trim((CharSequence) m7905constructorimpl).toString();
            String str = obj;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "rungps://gym/", false, 2, (Object) null)) {
                String parseUri2 = parseUri(Uri.parse(StringsKt.trim((CharSequence) ("rungps://" + StringsKt.substringAfter$default(obj, "rungps://", (String) null, 2, (Object) null))).toString()));
                if (parseUri2 != null) {
                    return parseUri2;
                }
            } else {
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "rungps:gym:start", false, 2, (Object) null)) {
                    return "start_next";
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "rungps:gym:free", false, 2, (Object) null)) {
                    return "start_free";
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "rungps:gym:finish", false, 2, (Object) null)) {
                    return "finish";
                }
            }
        }
        return null;
    }

    public final String readNdefActionFromTag(Tag tag) {
        NdefMessage cachedNdefMessage;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Ndef ndef = Ndef.get(tag);
        String str = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (ndef == null) {
            return null;
        }
        try {
            ndef.connect();
            cachedNdefMessage = ndef.getCachedNdefMessage();
        } catch (Exception unused) {
            Result.Companion companion2 = Result.INSTANCE;
            ndef.close();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                ndef.close();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
            throw th2;
        }
        if (cachedNdefMessage != null || (cachedNdefMessage = ndef.getNdefMessage()) != null) {
            str = parseNdefMessage(cachedNdefMessage);
            Result.Companion companion5 = Result.INSTANCE;
            GymNfcHandler gymNfcHandler = this;
            ndef.close();
            Result.m7905constructorimpl(Unit.INSTANCE);
            return str;
        }
        try {
            Result.Companion companion6 = Result.INSTANCE;
            GymNfcHandler gymNfcHandler2 = this;
            ndef.close();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion7 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th4));
        }
        return null;
    }

    public final TagResult tagResultForAction(String action, boolean hasOpenSession) {
        Intrinsics.checkNotNullParameter(action, "action");
        int hashCode = action.hashCode();
        if (hashCode != -1573554135) {
            if (hashCode != -1573327696) {
                if (hashCode == -1274442605 && action.equals("finish") && hasOpenSession) {
                    return TagResult.ASK_FINISH;
                }
                return null;
            }
            if (!action.equals("start_next")) {
                return null;
            }
        } else if (!action.equals("start_free")) {
            return null;
        }
        return hasOpenSession ? TagResult.ASK_FINISH : TagResult.ASK_START;
    }

    public final void setPending(Context context, String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        context.getSharedPreferences("gym_nfc", 0).edit().putString(KEY_ACTION, action).putString(KEY_OPEN_TAB, "gym").apply();
    }

    public final String consumePending(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("gym_nfc", 0);
        String string = sharedPreferences.getString(KEY_ACTION, null);
        if (string == null) {
            return null;
        }
        sharedPreferences.edit().remove(KEY_ACTION).apply();
        return string;
    }

    public final void requestOpenTab(Context context, String tab) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tab, "tab");
        context.getSharedPreferences("gym_nfc", 0).edit().putString(KEY_OPEN_TAB, tab).apply();
    }

    public final void clearOpenTab(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences("gym_nfc", 0).edit().remove(KEY_OPEN_TAB).remove(KEY_FOCUS_SESSION_ID).apply();
    }

    public final void requestFocusGymSession(Context context, long sessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences("gym_nfc", 0).edit().putLong(KEY_FOCUS_SESSION_ID, sessionId).apply();
    }

    public final Long consumeFocusGymSession(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("gym_nfc", 0);
        if (!sharedPreferences.contains(KEY_FOCUS_SESSION_ID)) {
            return null;
        }
        long j = sharedPreferences.getLong(KEY_FOCUS_SESSION_ID, 0L);
        sharedPreferences.edit().remove(KEY_FOCUS_SESSION_ID).apply();
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public final boolean isLauncherMainIntent(Intent intent) {
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        String stringExtra = intent.getStringExtra(KEY_OPEN_TAB);
        if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
            return false;
        }
        String stringExtra2 = intent.getStringExtra("widget_action");
        return stringExtra2 == null || StringsKt.isBlank(stringExtra2);
    }

    public final void stashOpenTabFromIntent(Context context, Intent intent) {
        String stringExtra;
        Long longOrNull;
        String stringExtra2;
        Intrinsics.checkNotNullParameter(context, "context");
        String obj = (intent == null || (stringExtra2 = intent.getStringExtra(KEY_OPEN_TAB)) == null) ? null : StringsKt.trim((CharSequence) stringExtra2).toString();
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            requestOpenTab(context, obj);
        }
        if (intent == null || (stringExtra = intent.getStringExtra("open_gym_session_id")) == null || (longOrNull = StringsKt.toLongOrNull(stringExtra)) == null) {
            return;
        }
        INSTANCE.requestFocusGymSession(context, longOrNull.longValue());
    }

    public final void clearStaleDeepLinks(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        clearOpenTab(context);
    }

    public final String consumeOpenTab(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("gym_nfc", 0);
        String string = sharedPreferences.getString(KEY_OPEN_TAB, null);
        if (string == null) {
            return null;
        }
        sharedPreferences.edit().remove(KEY_OPEN_TAB).apply();
        return string;
    }

    public static /* synthetic */ TagResult handleTagDiscoveryIntent$default(GymNfcHandler gymNfcHandler, Context context, Intent intent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return gymNfcHandler.handleTagDiscoveryIntent(context, intent, z, z2);
    }

    public final TagResult handleTagDiscoveryIntent(Context context, Intent intent, boolean hasOpenSession, boolean allowBackground) {
        Tag tag;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), "android.nfc.action.TAG_DISCOVERED") || (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG", Tag.class)) == null) {
            return null;
        }
        if (allowBackground || ((!GymNfcBattery.INSTANCE.isPowerSave(context) || GymNfcConfig.INSTANCE.isRegistering(context)) && GymNfcGuard.INSTANCE.isUnlockedAndAwake(context))) {
            return handleReaderTag(context, tag, hasOpenSession, allowBackground);
        }
        return null;
    }

    public static /* synthetic */ TagResult handleReaderTag$default(GymNfcHandler gymNfcHandler, Context context, Tag tag, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return gymNfcHandler.handleReaderTag(context, tag, z, z2);
    }

    public final TagResult handleReaderTag(Context context, Tag tag, boolean hasOpenSession, boolean foreground) {
        TagResult tagResultForAction;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (GymNfcBattery.INSTANCE.isPowerSave(context) && !GymNfcConfig.INSTANCE.isRegistering(context) && !foreground) {
            return null;
        }
        String readNdefActionFromTag = readNdefActionFromTag(tag);
        return (readNdefActionFromTag == null || (tagResultForAction = INSTANCE.tagResultForAction(readNdefActionFromTag, hasOpenSession)) == null) ? processMembershipTag(context, tag, hasOpenSession, foreground) : tagResultForAction;
    }

    public static /* synthetic */ TagResult handleRegisteredTag$default(GymNfcHandler gymNfcHandler, Context context, Tag tag, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return gymNfcHandler.handleRegisteredTag(context, tag, z, z2);
    }

    public final TagResult handleRegisteredTag(Context context, Tag tag, boolean hasOpenSession, boolean foreground) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!GymNfcBattery.INSTANCE.isPowerSave(context) || GymNfcConfig.INSTANCE.isRegistering(context) || foreground) {
            return processMembershipTag(context, tag, hasOpenSession, foreground);
        }
        return null;
    }

    private final TagResult processMembershipTag(Context context, Tag tag, boolean hasOpenSession, boolean foreground) {
        byte[] id = tag.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        String formatTagId = formatTagId(id);
        if (GymNfcConfig.INSTANCE.isRegistering(context)) {
            String registeringCardName = GymNfcConfig.INSTANCE.registeringCardName(context);
            if (registeringCardName == null) {
                registeringCardName = "Gym card " + (GymCardStore.INSTANCE.all(context).size() + 1);
            }
            GymNfcConfig.INSTANCE.setLastMatchedCardName(context, GymCardStore.add$default(GymCardStore.INSTANCE, context, formatTagId, registeringCardName, null, 8, null).getName());
            GymNfcConfig.setRegistering$default(GymNfcConfig.INSTANCE, context, false, null, 4, null);
            return TagResult.REGISTERED;
        }
        RegisteredGymCard findByUid = GymCardStore.INSTANCE.findByUid(context, formatTagId);
        if (findByUid == null) {
            return null;
        }
        GymNfcConfig.INSTANCE.setLastMatchedCardName(context, findByUid.getName());
        if ((foreground || GymNfcGuard.INSTANCE.isUnlockedAndAwake(context)) && GymNfcConfig.INSTANCE.acceptTagScan(context)) {
            return hasOpenSession ? TagResult.ASK_FINISH : TagResult.ASK_START;
        }
        return null;
    }

    public final String parseIntentAction(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        int hashCode = action.hashCode();
        if (hashCode == -1173171990) {
            if (action.equals("android.intent.action.VIEW")) {
                return parseUri(intent.getData());
            }
            return null;
        }
        if (hashCode != 1865807226 || !action.equals("android.nfc.action.NDEF_DISCOVERED")) {
            return null;
        }
        String parseNdefIntent = parseNdefIntent(intent);
        return parseNdefIntent == null ? parseUri(intent.getData()) : parseNdefIntent;
    }

    public final boolean handleIntent(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        String parseIntentAction = parseIntentAction(intent);
        if (parseIntentAction == null) {
            return false;
        }
        setPending(context, parseIntentAction);
        return true;
    }
}
