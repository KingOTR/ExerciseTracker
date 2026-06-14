package com.example.rungps.spotify;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.spotify.SpotifyLoopbackAuth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.mapsforge.core.model.Tag;

/* compiled from: SpotifyLoopbackAuth.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/spotify/SpotifyLoopbackAuth;", "", "<init>", "()V", "openSession", "Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Session;", "timeoutMs", "", "handleOnce", "Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Callback;", "sock", "Ljava/net/Socket;", "parseQuery", "", "", "q", "Callback", "Session", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyLoopbackAuth {
    public static final int $stable = 0;
    public static final SpotifyLoopbackAuth INSTANCE = new SpotifyLoopbackAuth();

    private SpotifyLoopbackAuth() {
    }

    /* compiled from: SpotifyLoopbackAuth.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Callback;", "", "code", "", "state", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getState", "getError", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Callback {
        public static final int $stable = 0;
        private final String code;
        private final String error;
        private final String state;

        public static /* synthetic */ Callback copy$default(Callback callback, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callback.code;
            }
            if ((i & 2) != 0) {
                str2 = callback.state;
            }
            if ((i & 4) != 0) {
                str3 = callback.error;
            }
            return callback.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Callback copy(String code, String state, String error) {
            return new Callback(code, state, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) other;
            return Intrinsics.areEqual(this.code, callback.code) && Intrinsics.areEqual(this.state, callback.state) && Intrinsics.areEqual(this.error, callback.error);
        }

        public int hashCode() {
            String str = this.code;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.state;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.error;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Callback(code=" + this.code + ", state=" + this.state + ", error=" + this.error + ")";
        }

        public Callback(String str, String str2, String str3) {
            this.code = str;
            this.state = str2;
            this.error = str3;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getState() {
            return this.state;
        }

        public final String getError() {
            return this.error;
        }
    }

    /* compiled from: SpotifyLoopbackAuth.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Session;", "", "server", "Ljava/net/ServerSocket;", "redirectUri", "", "timeoutMs", "", "<init>", "(Ljava/net/ServerSocket;Ljava/lang/String;J)V", "getRedirectUri", "()Ljava/lang/String;", "startedAt", "done", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callback", "Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Callback;", "start", "", "start$app_sideload", "awaitCallback", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Session {
        public static final int $stable = 8;
        private volatile Callback callback;
        private final AtomicBoolean done;
        private final String redirectUri;
        private final ServerSocket server;
        private final long startedAt;
        private final long timeoutMs;

        public Session(ServerSocket server, String redirectUri, long j) {
            Intrinsics.checkNotNullParameter(server, "server");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.server = server;
            this.redirectUri = redirectUri;
            this.timeoutMs = j;
            this.startedAt = System.currentTimeMillis();
            this.done = new AtomicBoolean(false);
        }

        public final String getRedirectUri() {
            return this.redirectUri;
        }

        public final void start$app_sideload() {
            ThreadsKt.thread$default(false, true, null, "spotify-loopback", 0, new Function0() { // from class: com.example.rungps.spotify.SpotifyLoopbackAuth$Session$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit start$lambda$2;
                    start$lambda$2 = SpotifyLoopbackAuth.Session.start$lambda$2(SpotifyLoopbackAuth.Session.this);
                    return start$lambda$2;
                }
            }, 21, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit start$lambda$2(Session session) {
            Socket accept;
            try {
                Result.Companion companion = Result.INSTANCE;
                session.server.setSoTimeout(1000);
                while (!session.done.get() && System.currentTimeMillis() - session.startedAt < session.timeoutMs) {
                    try {
                        accept = session.server.accept();
                    } catch (Exception unused) {
                    }
                    try {
                        session.callback = SpotifyLoopbackAuth.INSTANCE.handleOnce(accept);
                        session.done.set(true);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(accept, null);
                    } finally {
                    }
                }
                if (!session.done.get()) {
                    session.callback = new Callback(null, null, "timeout");
                    session.done.set(true);
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }

        public final Object awaitCallback(Continuation<? super Callback> continuation) {
            return BuildersKt.withContext(Dispatchers.getIO(), new SpotifyLoopbackAuth$Session$awaitCallback$2(this, null), continuation);
        }

        public final void close() {
            this.done.set(true);
            try {
                Result.Companion companion = Result.INSTANCE;
                Session session = this;
                this.server.close();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public static /* synthetic */ Session openSession$default(SpotifyLoopbackAuth spotifyLoopbackAuth, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = GymNfcConfig.DEFAULT_SAVER_POLL_MS;
        }
        return spotifyLoopbackAuth.openSession(j);
    }

    public final Session openSession(long timeoutMs) {
        ServerSocket serverSocket = new ServerSocket(0, 1, InetAddress.getByName("127.0.0.1"));
        Session session = new Session(serverSocket, "http://127.0.0.1:" + serverSocket.getLocalPort() + "/callback", timeoutMs);
        session.start$app_sideload();
        return session;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callback handleOnce(Socket sock) {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream(), Charsets.UTF_8));
        PrintWriter printWriter = new PrintWriter(sock.getOutputStream());
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            readLine = "";
        }
        String str2 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) readLine, new String[]{" "}, false, 0, 6, (Object) null), 1);
        if (str2 == null) {
            str2 = "";
        }
        Map<String, String> parseQuery = parseQuery(StringsKt.substringAfter(str2, '?', ""));
        String str3 = parseQuery.get("code");
        String str4 = parseQuery.get("state");
        String str5 = parseQuery.get("error");
        String str6 = str5;
        if (str6 != null && !StringsKt.isBlank(str6)) {
            str = "<html><body><h2>Spotify authorization failed</h2><p>" + str5 + "</p><p>You can close this tab.</p></body></html>";
        } else {
            str = "<html><body><h2>Spotify connected</h2><p>You can return to the app.</p></body></html>";
        }
        printWriter.print("HTTP/1.1 200 OK\r\n");
        printWriter.print("Content-Type: text/html; charset=utf-8\r\n");
        printWriter.print("Connection: close\r\n");
        printWriter.print("\r\n");
        printWriter.print(str);
        printWriter.flush();
        return new Callback(str3, str4, str5);
    }

    private final Map<String, String> parseQuery(String q) {
        Pair pair;
        String str = q;
        if (StringsKt.isBlank(str)) {
            return MapsKt.emptyMap();
        }
        List<String> split$default = StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String str2 : split$default) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, Tag.KEY_VALUE_SEPARATOR, 0, false, 6, (Object) null);
            if (indexOf$default <= 0) {
                pair = null;
            } else {
                String substring = str2.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String decode = URLDecoder.decode(substring, "UTF-8");
                String substring2 = str2.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                pair = TuplesKt.to(decode, URLDecoder.decode(substring2, "UTF-8"));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
