package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.decode.FileImageSource;
import coil.decode.ImageSource;
import coil.fetch.DrawableResult;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.Options;
import coil.request.RequestService;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.maplibre.android.BuildConfig;

/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u000234B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ6\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010#J>\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010'J0\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0081@¢\u0006\u0004\b*\u0010+J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "imageLoader", "Lcoil/ImageLoader;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "request", "Lcoil/request/ImageRequest;", "mappedData", "", "_options", "Lcoil/request/Options;", "eventListener", "Lcoil/EventListener;", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "Lcoil/fetch/FetchResult;", "components", "Lcoil/ComponentRegistry;", "options", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decode", "fetchResult", "Lcoil/fetch/SourceResult;", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", BuildConfig.FLAVOR, "Landroid/graphics/drawable/Drawable;", "transformations", "", "Lcoil/transform/Transformation;", "ExecuteResult", "Companion", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EngineInterceptor implements Interceptor {
    private static final String TAG = "EngineInterceptor";
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final MemoryCacheService memoryCacheService;
    private final RequestService requestService;
    private final SystemCallbacks systemCallbacks;

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // coil.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(Interceptor.Chain chain, Continuation<? super ImageResult> continuation) {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        try {
            if (continuation instanceof EngineInterceptor$intercept$1) {
                engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuation;
                if ((engineInterceptor$intercept$1.label & Integer.MIN_VALUE) != 0) {
                    engineInterceptor$intercept$1.label -= Integer.MIN_VALUE;
                    Object obj = engineInterceptor$intercept$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = engineInterceptor$intercept$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ImageRequest request = chain.getRequest();
                        Object data = request.getData();
                        Size size = chain.getSize();
                        EventListener eventListener = Utils.getEventListener(chain);
                        Options options = this.requestService.options(request, size);
                        Scale scale = options.getScale();
                        eventListener.mapStart(request, data);
                        Object map = this.imageLoader.getComponents().map(data, options);
                        eventListener.mapEnd(request, map);
                        MemoryCache.Key newCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
                        MemoryCache.Value cacheValue = newCacheKey != null ? this.memoryCacheService.getCacheValue(request, newCacheKey, size, scale) : null;
                        if (cacheValue != null) {
                            return this.memoryCacheService.newResult(chain, request, newCacheKey, cacheValue);
                        }
                        CoroutineDispatcher fetcherDispatcher = request.getFetcherDispatcher();
                        EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(this, request, map, options, eventListener, newCacheKey, chain, null);
                        engineInterceptor$intercept$1.L$0 = this;
                        engineInterceptor$intercept$1.L$1 = chain;
                        engineInterceptor$intercept$1.label = 1;
                        obj = BuildersKt.withContext(fetcherDispatcher, engineInterceptor$intercept$2, engineInterceptor$intercept$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return this.requestService.errorResult(chain.getRequest(), th);
        }
        engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuation);
        Object obj2 = engineInterceptor$intercept$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$intercept$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:25:0x0054, B:26:0x0162, B:39:0x0077, B:41:0x0120, B:43:0x012a, B:47:0x016b, B:49:0x016f, B:51:0x01e8, B:52:0x01ed), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:25:0x0054, B:26:0x0162, B:39:0x0077, B:41:0x0120, B:43:0x012a, B:47:0x016b, B:49:0x016f, B:51:0x01e8, B:52:0x01ed), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, coil.request.Options] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        Ref.ObjectRef objectRef;
        ImageSource source;
        ImageRequest imageRequest2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        EngineInterceptor engineInterceptor;
        Ref.ObjectRef objectRef5;
        T t;
        FetchResult fetchResult;
        ExecuteResult executeResult;
        Ref.ObjectRef objectRef6;
        EventListener eventListener3;
        ImageRequest imageRequest3;
        Ref.ObjectRef objectRef7;
        EngineInterceptor engineInterceptor2;
        SourceResult sourceResult;
        Object transform$coil_base_release;
        ImageSource source2;
        Object obj3;
        Object obj4;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        try {
            if (continuation instanceof EngineInterceptor$execute$1) {
                engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuation;
                if ((engineInterceptor$execute$1.label & Integer.MIN_VALUE) != 0) {
                    engineInterceptor$execute$1.label -= Integer.MIN_VALUE;
                    EngineInterceptor$execute$1 engineInterceptor$execute$12 = engineInterceptor$execute$1;
                    Object obj5 = engineInterceptor$execute$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    objectRef = engineInterceptor$execute$12.label;
                    if (objectRef != 0) {
                        ResultKt.throwOnFailure(obj5);
                        Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                        objectRef8.element = options;
                        Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                        objectRef9.element = this.imageLoader.getComponents();
                        Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                        try {
                            objectRef8.element = this.requestService.updateOptionsOnWorkerThread((Options) objectRef8.element);
                            if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                                ComponentRegistry.Builder newBuilder = ((ComponentRegistry) objectRef9.element).newBuilder();
                                Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                                if (fetcherFactory != null) {
                                    newBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                                }
                                Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                                if (decoderFactory != null) {
                                    newBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                                }
                                objectRef9.element = newBuilder.build();
                            }
                            ComponentRegistry componentRegistry = (ComponentRegistry) objectRef9.element;
                            Options options2 = (Options) objectRef8.element;
                            engineInterceptor$execute$12.L$0 = this;
                            engineInterceptor$execute$12.L$1 = imageRequest;
                            engineInterceptor$execute$12.L$2 = obj;
                            engineInterceptor$execute$12.L$3 = eventListener;
                            engineInterceptor$execute$12.L$4 = objectRef8;
                            engineInterceptor$execute$12.L$5 = objectRef9;
                            engineInterceptor$execute$12.L$6 = objectRef10;
                            engineInterceptor$execute$12.L$7 = objectRef10;
                            engineInterceptor$execute$12.label = 1;
                            Object fetch = fetch(componentRegistry, imageRequest, obj, options2, eventListener, engineInterceptor$execute$12);
                            if (fetch == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            imageRequest2 = imageRequest;
                            obj2 = obj;
                            eventListener2 = eventListener;
                            objectRef2 = objectRef8;
                            objectRef3 = objectRef9;
                            objectRef4 = objectRef10;
                            engineInterceptor = this;
                            objectRef5 = objectRef4;
                            t = fetch;
                        } catch (Throwable th) {
                            th = th;
                            objectRef = objectRef10;
                            T t2 = objectRef.element;
                            SourceResult sourceResult2 = t2 instanceof SourceResult ? (SourceResult) t2 : null;
                            if (sourceResult2 != null && (source = sourceResult2.getSource()) != null) {
                                Utils.closeQuietly(source);
                            }
                            throw th;
                        }
                    } else {
                        if (objectRef != 1) {
                            if (objectRef != 2) {
                                if (objectRef != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj5);
                                obj4 = obj5;
                                ExecuteResult executeResult2 = (ExecuteResult) obj4;
                                Drawable drawable = executeResult2.getDrawable();
                                bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                                if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                    bitmap.prepareToDraw();
                                }
                                return executeResult2;
                            }
                            objectRef4 = (Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                            objectRef7 = (Ref.ObjectRef) engineInterceptor$execute$12.L$3;
                            eventListener3 = (EventListener) engineInterceptor$execute$12.L$2;
                            imageRequest3 = (ImageRequest) engineInterceptor$execute$12.L$1;
                            engineInterceptor2 = (EngineInterceptor) engineInterceptor$execute$12.L$0;
                            ResultKt.throwOnFailure(obj5);
                            obj3 = obj5;
                            ExecuteResult executeResult3 = (ExecuteResult) obj3;
                            engineInterceptor = engineInterceptor2;
                            objectRef6 = objectRef7;
                            executeResult = executeResult3;
                            T t3 = objectRef4.element;
                            sourceResult = t3 instanceof SourceResult ? (SourceResult) t3 : null;
                            if (sourceResult != null && (source2 = sourceResult.getSource()) != null) {
                                Utils.closeQuietly(source2);
                            }
                            Options options3 = (Options) objectRef6.element;
                            engineInterceptor$execute$12.L$0 = null;
                            engineInterceptor$execute$12.L$1 = null;
                            engineInterceptor$execute$12.L$2 = null;
                            engineInterceptor$execute$12.L$3 = null;
                            engineInterceptor$execute$12.L$4 = null;
                            engineInterceptor$execute$12.L$5 = null;
                            engineInterceptor$execute$12.L$6 = null;
                            engineInterceptor$execute$12.L$7 = null;
                            engineInterceptor$execute$12.label = 3;
                            transform$coil_base_release = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options3, eventListener3, engineInterceptor$execute$12);
                            obj4 = transform$coil_base_release;
                            if (transform$coil_base_release == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ExecuteResult executeResult22 = (ExecuteResult) obj4;
                            Drawable drawable2 = executeResult22.getDrawable();
                            if (drawable2 instanceof BitmapDrawable) {
                            }
                            if (bitmapDrawable != null) {
                                bitmap.prepareToDraw();
                            }
                            return executeResult22;
                        }
                        objectRef5 = (Ref.ObjectRef) engineInterceptor$execute$12.L$7;
                        objectRef4 = (Ref.ObjectRef) engineInterceptor$execute$12.L$6;
                        Ref.ObjectRef objectRef11 = (Ref.ObjectRef) engineInterceptor$execute$12.L$5;
                        objectRef2 = (Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                        eventListener2 = (EventListener) engineInterceptor$execute$12.L$3;
                        Object obj6 = engineInterceptor$execute$12.L$2;
                        imageRequest2 = (ImageRequest) engineInterceptor$execute$12.L$1;
                        engineInterceptor = (EngineInterceptor) engineInterceptor$execute$12.L$0;
                        ResultKt.throwOnFailure(obj5);
                        objectRef3 = objectRef11;
                        obj2 = obj6;
                        t = obj5;
                    }
                    objectRef5.element = t;
                    fetchResult = (FetchResult) objectRef4.element;
                    if (fetchResult instanceof SourceResult) {
                        if (!(fetchResult instanceof DrawableResult)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        executeResult = new ExecuteResult(((DrawableResult) objectRef4.element).getDrawable(), ((DrawableResult) objectRef4.element).getIsSampled(), ((DrawableResult) objectRef4.element).getDataSource(), null);
                        objectRef6 = objectRef2;
                        eventListener3 = eventListener2;
                        imageRequest3 = imageRequest2;
                        T t32 = objectRef4.element;
                        if (t32 instanceof SourceResult) {
                        }
                        if (sourceResult != null) {
                        }
                        Options options32 = (Options) objectRef6.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.L$7 = null;
                        engineInterceptor$execute$12.label = 3;
                        transform$coil_base_release = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options32, eventListener3, engineInterceptor$execute$12);
                        obj4 = transform$coil_base_release;
                        if (transform$coil_base_release == coroutine_suspended) {
                        }
                        ExecuteResult executeResult222 = (ExecuteResult) obj4;
                        Drawable drawable22 = executeResult222.getDrawable();
                        if (drawable22 instanceof BitmapDrawable) {
                        }
                        if (bitmapDrawable != null) {
                        }
                        return executeResult222;
                    }
                    CoroutineDispatcher decoderDispatcher = imageRequest2.getDecoderDispatcher();
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef4, objectRef3, imageRequest2, obj2, objectRef2, eventListener2, null);
                    engineInterceptor$execute$12.L$0 = engineInterceptor;
                    engineInterceptor$execute$12.L$1 = imageRequest2;
                    engineInterceptor$execute$12.L$2 = eventListener2;
                    engineInterceptor$execute$12.L$3 = objectRef2;
                    engineInterceptor$execute$12.L$4 = objectRef4;
                    engineInterceptor$execute$12.L$5 = null;
                    engineInterceptor$execute$12.L$6 = null;
                    engineInterceptor$execute$12.L$7 = null;
                    engineInterceptor$execute$12.label = 2;
                    Object withContext = BuildersKt.withContext(decoderDispatcher, engineInterceptor$execute$executeResult$1, engineInterceptor$execute$12);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef7 = objectRef2;
                    eventListener3 = eventListener2;
                    imageRequest3 = imageRequest2;
                    engineInterceptor2 = engineInterceptor;
                    obj3 = withContext;
                    ExecuteResult executeResult32 = (ExecuteResult) obj3;
                    engineInterceptor = engineInterceptor2;
                    objectRef6 = objectRef7;
                    executeResult = executeResult32;
                    T t322 = objectRef4.element;
                    if (t322 instanceof SourceResult) {
                    }
                    if (sourceResult != null) {
                        Utils.closeQuietly(source2);
                    }
                    Options options322 = (Options) objectRef6.element;
                    engineInterceptor$execute$12.L$0 = null;
                    engineInterceptor$execute$12.L$1 = null;
                    engineInterceptor$execute$12.L$2 = null;
                    engineInterceptor$execute$12.L$3 = null;
                    engineInterceptor$execute$12.L$4 = null;
                    engineInterceptor$execute$12.L$5 = null;
                    engineInterceptor$execute$12.L$6 = null;
                    engineInterceptor$execute$12.L$7 = null;
                    engineInterceptor$execute$12.label = 3;
                    transform$coil_base_release = engineInterceptor.transform$coil_base_release(executeResult, imageRequest3, options322, eventListener3, engineInterceptor$execute$12);
                    obj4 = transform$coil_base_release;
                    if (transform$coil_base_release == coroutine_suspended) {
                    }
                    ExecuteResult executeResult2222 = (ExecuteResult) obj4;
                    Drawable drawable222 = executeResult2222.getDrawable();
                    if (drawable222 instanceof BitmapDrawable) {
                    }
                    if (bitmapDrawable != null) {
                    }
                    return executeResult2222;
                }
            }
            if (objectRef != 0) {
            }
            objectRef5.element = t;
            fetchResult = (FetchResult) objectRef4.element;
            if (fetchResult instanceof SourceResult) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        engineInterceptor$execute$1 = new EngineInterceptor$execute$1(this, continuation);
        EngineInterceptor$execute$1 engineInterceptor$execute$122 = engineInterceptor$execute$1;
        Object obj52 = engineInterceptor$execute$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        objectRef = engineInterceptor$execute$122.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super FetchResult> continuation) {
        EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        int i;
        int i2;
        Pair<Fetcher, Integer> newFetcher;
        ImageSource source;
        if (continuation instanceof EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (EngineInterceptor$fetch$1) continuation;
            if ((engineInterceptor$fetch$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$fetch$1.label -= Integer.MIN_VALUE;
                Object obj2 = engineInterceptor$fetch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    i2 = 0;
                    newFetcher = componentRegistry.newFetcher(obj, options, this.imageLoader, i2);
                    if (newFetcher != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = engineInterceptor$fetch$1.I$0;
                    Fetcher fetcher = (Fetcher) engineInterceptor$fetch$1.L$6;
                    EventListener eventListener2 = (EventListener) engineInterceptor$fetch$1.L$5;
                    Options options2 = (Options) engineInterceptor$fetch$1.L$4;
                    Object obj3 = engineInterceptor$fetch$1.L$3;
                    ImageRequest imageRequest2 = (ImageRequest) engineInterceptor$fetch$1.L$2;
                    ComponentRegistry componentRegistry2 = (ComponentRegistry) engineInterceptor$fetch$1.L$1;
                    EngineInterceptor engineInterceptor = (EngineInterceptor) engineInterceptor$fetch$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    EngineInterceptor$fetch$1 engineInterceptor$fetch$12 = engineInterceptor$fetch$1;
                    int i4 = i3;
                    this = engineInterceptor;
                    EngineInterceptor$fetch$1 engineInterceptor$fetch$13 = engineInterceptor$fetch$12;
                    eventListener = eventListener2;
                    imageRequest = imageRequest2;
                    options = options2;
                    obj = obj3;
                    FetchResult fetchResult = (FetchResult) obj2;
                    try {
                        eventListener.fetchEnd(imageRequest, fetcher, options, fetchResult);
                        if (fetchResult == null) {
                            return fetchResult;
                        }
                        i2 = i4;
                        componentRegistry = componentRegistry2;
                        engineInterceptor$fetch$1 = engineInterceptor$fetch$13;
                        newFetcher = componentRegistry.newFetcher(obj, options, this.imageLoader, i2);
                        if (newFetcher != null) {
                            throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                        }
                        Fetcher first = newFetcher.getFirst();
                        int intValue = newFetcher.getSecond().intValue() + 1;
                        eventListener.fetchStart(imageRequest, first, options);
                        engineInterceptor$fetch$1.L$0 = this;
                        engineInterceptor$fetch$1.L$1 = componentRegistry;
                        engineInterceptor$fetch$1.L$2 = imageRequest;
                        engineInterceptor$fetch$1.L$3 = obj;
                        engineInterceptor$fetch$1.L$4 = options;
                        engineInterceptor$fetch$1.L$5 = eventListener;
                        engineInterceptor$fetch$1.L$6 = first;
                        engineInterceptor$fetch$1.I$0 = intValue;
                        engineInterceptor$fetch$1.label = 1;
                        Object fetch = first.fetch(engineInterceptor$fetch$1);
                        if (fetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        componentRegistry2 = componentRegistry;
                        fetcher = first;
                        EngineInterceptor$fetch$1 engineInterceptor$fetch$14 = engineInterceptor$fetch$1;
                        i4 = intValue;
                        obj2 = fetch;
                        engineInterceptor$fetch$13 = engineInterceptor$fetch$14;
                        FetchResult fetchResult2 = (FetchResult) obj2;
                        eventListener.fetchEnd(imageRequest, fetcher, options, fetchResult2);
                        if (fetchResult2 == null) {
                        }
                    } catch (Throwable th) {
                        SourceResult sourceResult = fetchResult2 instanceof SourceResult ? (SourceResult) fetchResult2 : null;
                        if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                            Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                }
            }
        }
        engineInterceptor$fetch$1 = new EngineInterceptor$fetch$1(this, continuation);
        Object obj22 = engineInterceptor$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0097 -> B:10:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(SourceResult sourceResult, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        EngineInterceptor$decode$1 engineInterceptor$decode$1;
        int i;
        int i2;
        Pair<Decoder, Integer> newDecoder;
        if (continuation instanceof EngineInterceptor$decode$1) {
            engineInterceptor$decode$1 = (EngineInterceptor$decode$1) continuation;
            if ((engineInterceptor$decode$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$decode$1.label -= Integer.MIN_VALUE;
                Object obj2 = engineInterceptor$decode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$decode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    i2 = 0;
                    newDecoder = componentRegistry.newDecoder(sourceResult, options, this.imageLoader, i2);
                    if (newDecoder != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = engineInterceptor$decode$1.I$0;
                    Decoder decoder = (Decoder) engineInterceptor$decode$1.L$7;
                    EventListener eventListener2 = (EventListener) engineInterceptor$decode$1.L$6;
                    Options options2 = (Options) engineInterceptor$decode$1.L$5;
                    obj = engineInterceptor$decode$1.L$4;
                    ImageRequest imageRequest2 = (ImageRequest) engineInterceptor$decode$1.L$3;
                    ComponentRegistry componentRegistry2 = (ComponentRegistry) engineInterceptor$decode$1.L$2;
                    SourceResult sourceResult2 = (SourceResult) engineInterceptor$decode$1.L$1;
                    EngineInterceptor engineInterceptor = (EngineInterceptor) engineInterceptor$decode$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    EngineInterceptor$decode$1 engineInterceptor$decode$12 = engineInterceptor$decode$1;
                    int i4 = i3;
                    this = engineInterceptor;
                    EngineInterceptor$decode$1 engineInterceptor$decode$13 = engineInterceptor$decode$12;
                    eventListener = eventListener2;
                    componentRegistry = componentRegistry2;
                    options = options2;
                    imageRequest = imageRequest2;
                    DecodeResult decodeResult = (DecodeResult) obj2;
                    eventListener.decodeEnd(imageRequest, decoder, options, decodeResult);
                    if (decodeResult != null) {
                        i2 = i4;
                        sourceResult = sourceResult2;
                        engineInterceptor$decode$1 = engineInterceptor$decode$13;
                        newDecoder = componentRegistry.newDecoder(sourceResult, options, this.imageLoader, i2);
                        if (newDecoder != null) {
                            throw new IllegalStateException(("Unable to create a decoder that supports: " + obj).toString());
                        }
                        Decoder first = newDecoder.getFirst();
                        int intValue = newDecoder.getSecond().intValue() + 1;
                        eventListener.decodeStart(imageRequest, first, options);
                        engineInterceptor$decode$1.L$0 = this;
                        engineInterceptor$decode$1.L$1 = sourceResult;
                        engineInterceptor$decode$1.L$2 = componentRegistry;
                        engineInterceptor$decode$1.L$3 = imageRequest;
                        engineInterceptor$decode$1.L$4 = obj;
                        engineInterceptor$decode$1.L$5 = options;
                        engineInterceptor$decode$1.L$6 = eventListener;
                        engineInterceptor$decode$1.L$7 = first;
                        engineInterceptor$decode$1.I$0 = intValue;
                        engineInterceptor$decode$1.label = 1;
                        Object decode = first.decode(engineInterceptor$decode$1);
                        if (decode == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sourceResult2 = sourceResult;
                        decoder = first;
                        EngineInterceptor$decode$1 engineInterceptor$decode$14 = engineInterceptor$decode$1;
                        i4 = intValue;
                        obj2 = decode;
                        engineInterceptor$decode$13 = engineInterceptor$decode$14;
                        DecodeResult decodeResult2 = (DecodeResult) obj2;
                        eventListener.decodeEnd(imageRequest, decoder, options, decodeResult2);
                        if (decodeResult2 != null) {
                        }
                    } else {
                        Drawable drawable = decodeResult2.getDrawable();
                        boolean isSampled = decodeResult2.getIsSampled();
                        DataSource dataSource = sourceResult2.getDataSource();
                        ImageSource source = sourceResult2.getSource();
                        FileImageSource fileImageSource = source instanceof FileImageSource ? (FileImageSource) source : null;
                        return new ExecuteResult(drawable, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey() : null);
                    }
                }
            }
        }
        engineInterceptor$decode$1 = new EngineInterceptor$decode$1(this, continuation);
        Object obj22 = engineInterceptor$decode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$decode$1.label;
        if (i != 0) {
        }
    }

    public final Object transform$coil_base_release(ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        List<Transformation> transformations = imageRequest.getTransformations();
        if (transformations.isEmpty()) {
            return executeResult;
        }
        if (!(executeResult.getDrawable() instanceof BitmapDrawable) && !imageRequest.getAllowConversionToBitmap()) {
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "allowConversionToBitmap=false, skipping transformations for type " + executeResult.getDrawable().getClass().getCanonicalName() + '.', null);
            }
            return executeResult;
        }
        return BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new EngineInterceptor$transform$3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config safeConfig = Bitmaps.getSafeConfig(bitmap);
            if (ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "Converting bitmap with config " + safeConfig + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 4) {
                logger2.log(TAG, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", BuildConfig.FLAVOR, "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "copy", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExecuteResult {
        private final DataSource dataSource;
        private final String diskCacheKey;
        private final Drawable drawable;
        private final boolean isSampled;

        public ExecuteResult(Drawable drawable, boolean z, DataSource dataSource, String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: isSampled, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        public final ExecuteResult copy(Drawable drawable, boolean isSampled, DataSource dataSource, String diskCacheKey) {
            return new ExecuteResult(drawable, isSampled, dataSource, diskCacheKey);
        }
    }
}
