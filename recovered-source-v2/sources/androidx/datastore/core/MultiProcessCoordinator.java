package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: MultiProcessCoordinator.android.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\bH\u0002J\u000e\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J2\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@¢\u0006\u0002\u0010,J8\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0096@¢\u0006\u0002\u00100J:\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2$\b\u0004\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0082H¢\u0006\u0002\u00100J\f\u00102\u001a\u00020\u001d*\u00020\u0005H\u0002J\f\u00103\u001a\u00020\u001d*\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", "file", "Ljava/io/File;", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "LOCK_ERROR_MESSAGE", "", "LOCK_SUFFIX", "VERSION_SUFFIX", "getFile", "()Ljava/io/File;", "inMemoryMutex", "Lkotlinx/coroutines/sync/Mutex;", "lazySharedCounter", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "lockFile", "getLockFile", "lockFile$delegate", "Lkotlin/Lazy;", "sharedCounter", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "fileWithSuffix", "suffix", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withLazyCounter", "createIfNotExists", "createParentDirectories", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final CoroutineContext context;
    private final File file;
    private final Mutex inMemoryMutex;
    private final Lazy<SharedCounter> lazySharedCounter;

    /* renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final Lazy lockFile;
    private final Flow<Unit> updateNotifications;

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = MutexKt.Mutex$default(false, 1, null);
        this.lockFile = LazyKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                String str;
                File fileWithSuffix;
                MultiProcessCoordinator multiProcessCoordinator = MultiProcessCoordinator.this;
                str = multiProcessCoordinator.LOCK_SUFFIX;
                fileWithSuffix = multiProcessCoordinator.fileWithSuffix(str);
                MultiProcessCoordinator.this.createIfNotExists(fileWithSuffix);
                return fileWithSuffix;
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedCounter invoke() {
                SharedCounter.INSTANCE.loadLib();
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                final MultiProcessCoordinator multiProcessCoordinator = MultiProcessCoordinator.this;
                return companion.create$datastore_core_release(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final File invoke() {
                        String str;
                        File fileWithSuffix;
                        MultiProcessCoordinator multiProcessCoordinator2 = MultiProcessCoordinator.this;
                        str = multiProcessCoordinator2.VERSION_SUFFIX;
                        fileWithSuffix = multiProcessCoordinator2.fileWithSuffix(str);
                        MultiProcessCoordinator.this.createIfNotExists(fileWithSuffix);
                        return fileWithSuffix;
                    }
                });
            }
        });
    }

    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Flow<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00df, blocks: (B:16:0x00c1, B:30:0x00db, B:31:0x00e2), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #8 {all -> 0x00df, blocks: (B:16:0x00c1, B:30:0x00db, B:31:0x00e2), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object lock(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        MultiProcessCoordinator$lock$1 multiProcessCoordinator$lock$1;
        Object coroutine_suspended;
        int i;
        ?? r10;
        ?? r9;
        Function1<? super Continuation<? super T>, ? extends Object> function12;
        FileOutputStream fileOutputStream;
        Throwable th;
        Object exclusiveFileLockWithRetryIfDeadlock;
        java.io.Closeable closeable;
        Mutex mutex;
        Function1<? super Continuation<? super T>, ? extends Object> function13;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        Mutex mutex2;
        try {
            try {
                try {
                    try {
                        if (continuation instanceof MultiProcessCoordinator$lock$1) {
                            multiProcessCoordinator$lock$1 = (MultiProcessCoordinator$lock$1) continuation;
                            if ((multiProcessCoordinator$lock$1.label & Integer.MIN_VALUE) != 0) {
                                multiProcessCoordinator$lock$1.label -= Integer.MIN_VALUE;
                                Object obj = multiProcessCoordinator$lock$1.result;
                                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = multiProcessCoordinator$lock$1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj);
                                    Mutex mutex3 = this.inMemoryMutex;
                                    multiProcessCoordinator$lock$1.L$0 = this;
                                    multiProcessCoordinator$lock$1.L$1 = function1;
                                    multiProcessCoordinator$lock$1.L$2 = mutex3;
                                    multiProcessCoordinator$lock$1.label = 1;
                                    Object lock = mutex3.lock(null, multiProcessCoordinator$lock$1);
                                    function12 = function1;
                                    r10 = mutex3;
                                    if (lock == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            fileLock = (FileLock) multiProcessCoordinator$lock$1.L$2;
                                            closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.L$1;
                                            mutex2 = (Mutex) multiProcessCoordinator$lock$1.L$0;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                                try {
                                                    kotlin.io.CloseableKt.closeFinally(closeable, null);
                                                    mutex2.unlock(null);
                                                    return obj;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r10 = mutex2;
                                                    r10.unlock(null);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (fileLock != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        closeable = (java.io.Closeable) multiProcessCoordinator$lock$1.L$2;
                                        mutex = (Mutex) multiProcessCoordinator$lock$1.L$1;
                                        function13 = (Function1) multiProcessCoordinator$lock$1.L$0;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            fileLock2 = (FileLock) obj;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fileLock = null;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            multiProcessCoordinator$lock$1.L$0 = mutex;
                                            multiProcessCoordinator$lock$1.L$1 = closeable;
                                            multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                            multiProcessCoordinator$lock$1.label = 3;
                                            invoke = function13.invoke(multiProcessCoordinator$lock$1);
                                            if (invoke != coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            mutex2 = mutex;
                                            fileLock = fileLock2;
                                            obj = invoke;
                                            if (fileLock != null) {
                                            }
                                            kotlin.io.CloseableKt.closeFinally(closeable, null);
                                            mutex2.unlock(null);
                                            return obj;
                                        } catch (Throwable th5) {
                                            fileLock = fileLock2;
                                            th = th5;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    Mutex mutex4 = (Mutex) multiProcessCoordinator$lock$1.L$2;
                                    Function1<? super Continuation<? super T>, ? extends Object> function14 = (Function1) multiProcessCoordinator$lock$1.L$1;
                                    MultiProcessCoordinator multiProcessCoordinator = (MultiProcessCoordinator) multiProcessCoordinator$lock$1.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    r10 = mutex4;
                                    this = multiProcessCoordinator;
                                    function12 = function14;
                                }
                                fileOutputStream = new FileOutputStream(this.getLockFile());
                                FileOutputStream fileOutputStream2 = fileOutputStream;
                                Companion companion = INSTANCE;
                                multiProcessCoordinator$lock$1.L$0 = function12;
                                multiProcessCoordinator$lock$1.L$1 = r10;
                                multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                                multiProcessCoordinator$lock$1.label = 2;
                                exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, multiProcessCoordinator$lock$1);
                                if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Function1<? super Continuation<? super T>, ? extends Object> function15 = function12;
                                closeable = fileOutputStream;
                                mutex = r10;
                                obj = exclusiveFileLockWithRetryIfDeadlock;
                                function13 = function15;
                                fileLock2 = (FileLock) obj;
                                multiProcessCoordinator$lock$1.L$0 = mutex;
                                multiProcessCoordinator$lock$1.L$1 = closeable;
                                multiProcessCoordinator$lock$1.L$2 = fileLock2;
                                multiProcessCoordinator$lock$1.label = 3;
                                invoke = function13.invoke(multiProcessCoordinator$lock$1);
                                if (invoke != coroutine_suspended) {
                                }
                            }
                        }
                        Companion companion2 = INSTANCE;
                        multiProcessCoordinator$lock$1.L$0 = function12;
                        multiProcessCoordinator$lock$1.L$1 = r10;
                        multiProcessCoordinator$lock$1.L$2 = fileOutputStream;
                        multiProcessCoordinator$lock$1.label = 2;
                        exclusiveFileLockWithRetryIfDeadlock = companion2.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, multiProcessCoordinator$lock$1);
                        if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileLock = null;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                    FileOutputStream fileOutputStream22 = fileOutputStream;
                } catch (Throwable th7) {
                    boolean z = (Function1<? super Continuation<? super T>, ? extends Object>) fileOutputStream;
                    th = th7;
                    r9 = z;
                    r10 = r10;
                    try {
                        throw th;
                    } finally {
                    }
                }
                fileOutputStream = new FileOutputStream(this.getLockFile());
            } catch (Throwable th8) {
                th = th8;
                r10.unlock(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th9) {
            th = th9;
            r10 = multiProcessCoordinator$lock$1;
            r9 = function1;
        }
        multiProcessCoordinator$lock$1 = new MultiProcessCoordinator$lock$1(this, continuation);
        Object obj2 = multiProcessCoordinator$lock$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multiProcessCoordinator$lock$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:15:0x00e6, B:31:0x00fc, B:32:0x0105), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:15:0x00e6, B:31:0x00fc, B:32:0x0105), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        MultiProcessCoordinator$tryLock$1 multiProcessCoordinator$tryLock$1;
        Object coroutine_suspended;
        int i;
        ?? r11;
        Throwable th;
        String message;
        FileLock fileLock;
        FileLock fileLock2;
        Mutex mutex;
        java.io.Closeable closeable;
        Mutex mutex2;
        boolean z;
        MultiProcessCoordinator multiProcessCoordinator = this;
        ?? r2 = function2;
        try {
            try {
                if (continuation instanceof MultiProcessCoordinator$tryLock$1) {
                    multiProcessCoordinator$tryLock$1 = (MultiProcessCoordinator$tryLock$1) continuation;
                    if ((multiProcessCoordinator$tryLock$1.label & Integer.MIN_VALUE) != 0) {
                        multiProcessCoordinator$tryLock$1.label -= Integer.MIN_VALUE;
                        Object obj = multiProcessCoordinator$tryLock$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = multiProcessCoordinator$tryLock$1.label;
                        if (i == 0) {
                            if (i == 1) {
                                z = multiProcessCoordinator$tryLock$1.Z$0;
                                mutex2 = (Mutex) multiProcessCoordinator$tryLock$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                if (z) {
                                    mutex2.unlock(null);
                                }
                                return obj;
                            }
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r1 = multiProcessCoordinator$tryLock$1.Z$0;
                            fileLock2 = (FileLock) multiProcessCoordinator$tryLock$1.L$2;
                            closeable = (java.io.Closeable) multiProcessCoordinator$tryLock$1.L$1;
                            mutex = (Mutex) multiProcessCoordinator$tryLock$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                multiProcessCoordinator = r1;
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                try {
                                    kotlin.io.CloseableKt.closeFinally(closeable, null);
                                    if (multiProcessCoordinator != null) {
                                        mutex.unlock(null);
                                    }
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r2 = mutex;
                                    if (multiProcessCoordinator != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock2 != null) {
                                }
                                throw th;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex3 = multiProcessCoordinator.inMemoryMutex;
                        ?? tryLock = mutex3.tryLock(null);
                        try {
                            if (tryLock == false) {
                                Boolean boxBoolean = Boxing.boxBoolean(false);
                                multiProcessCoordinator$tryLock$1.L$0 = mutex3;
                                multiProcessCoordinator$tryLock$1.Z$0 = tryLock;
                                multiProcessCoordinator$tryLock$1.label = 1;
                                obj = r2.invoke(boxBoolean, multiProcessCoordinator$tryLock$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex2 = mutex3;
                                z = tryLock;
                                if (z) {
                                }
                                return obj;
                            }
                            FileInputStream fileInputStream = new FileInputStream(getLockFile());
                            try {
                                try {
                                    try {
                                        fileLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileLock2 = null;
                                        if (fileLock2 != null) {
                                            fileLock2.release();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    String message2 = e.getMessage();
                                    if ((message2 == null || !StringsKt.startsWith$default(message2, multiProcessCoordinator.LOCK_ERROR_MESSAGE, false, 2, (Object) null)) && ((message = e.getMessage()) == null || !StringsKt.startsWith$default(message, DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null))) {
                                        throw e;
                                    }
                                    fileLock = null;
                                }
                                try {
                                    Boolean boxBoolean2 = Boxing.boxBoolean(fileLock != null);
                                    multiProcessCoordinator$tryLock$1.L$0 = mutex3;
                                    multiProcessCoordinator$tryLock$1.L$1 = fileInputStream;
                                    multiProcessCoordinator$tryLock$1.L$2 = fileLock;
                                    multiProcessCoordinator$tryLock$1.Z$0 = tryLock;
                                    multiProcessCoordinator$tryLock$1.label = 2;
                                    obj = r2.invoke(boxBoolean2, multiProcessCoordinator$tryLock$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    fileLock2 = fileLock;
                                    mutex = mutex3;
                                    multiProcessCoordinator = tryLock;
                                    closeable = fileInputStream;
                                    if (fileLock2 != null) {
                                    }
                                    kotlin.io.CloseableKt.closeFinally(closeable, null);
                                    if (multiProcessCoordinator != null) {
                                    }
                                    return obj;
                                } catch (Throwable th5) {
                                    th = th5;
                                    fileLock2 = fileLock;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r2 = mutex3;
                                multiProcessCoordinator = tryLock;
                                r11 = fileInputStream;
                                try {
                                    throw th;
                                } catch (Throwable th7) {
                                    kotlin.io.CloseableKt.closeFinally(r11, th);
                                    throw th7;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r2 = mutex3;
                            multiProcessCoordinator = tryLock;
                            if (multiProcessCoordinator != null) {
                                r2.unlock(null);
                            }
                            throw th;
                        }
                    }
                }
                if (i == 0) {
                }
            } catch (Throwable th9) {
                r2 = multiProcessCoordinator$tryLock$1;
                r11 = coroutine_suspended;
                th = th9;
                multiProcessCoordinator = multiProcessCoordinator;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        multiProcessCoordinator$tryLock$1 = new MultiProcessCoordinator$tryLock$1(multiProcessCoordinator, continuation);
        Object obj2 = multiProcessCoordinator$tryLock$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multiProcessCoordinator$tryLock$1.label;
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        CoroutineContext coroutineContext = this.context;
        MultiProcessCoordinator$withLazyCounter$2 multiProcessCoordinator$withLazyCounter$2 = new MultiProcessCoordinator$withLazyCounter$2(function2, this, null);
        InlineMarker.mark(0);
        Object withContext = BuildersKt.withContext(coroutineContext, multiProcessCoordinator$withLazyCounter$2, continuation);
        InlineMarker.mark(1);
        return withContext;
    }

    /* compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) {
            MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1;
            int i;
            long j;
            if (continuation instanceof MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) {
                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = (MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) continuation;
                if ((multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label & Integer.MIN_VALUE) != 0) {
                    multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label -= Integer.MIN_VALUE;
                    Object obj = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0;
                        fileOutputStream = (FileOutputStream) multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        j *= 2;
                        if (j > MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                            try {
                            } catch (IOException e) {
                                String message = e.getMessage();
                                if (message == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) MultiProcessCoordinator.DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null)) {
                                    throw e;
                                }
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.L$0 = fileOutputStream;
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.J$0 = j;
                                multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label = 1;
                                if (DelayKt.delay(j, multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                            Intrinsics.checkNotNullExpressionValue(lock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                            return lock;
                        }
                        FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        Intrinsics.checkNotNullExpressionValue(lock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                        return lock2;
                    }
                    ResultKt.throwOnFailure(obj);
                    j = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
                    if (j > MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                    }
                }
            }
            multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 = new MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(this, continuation);
            Object obj2 = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = multiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1.label;
            if (i == 0) {
            }
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().getValue());
        }
        return BuildersKt.withContext(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return BuildersKt.withContext(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }
}
