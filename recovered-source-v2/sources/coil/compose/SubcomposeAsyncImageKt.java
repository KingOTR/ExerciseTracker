package coil.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÓ\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2&\b\u0002\u0010\r\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122&\b\u0002\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122&\b\u0002\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)\u001a©\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2&\b\u0002\u0010\r\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122&\b\u0002\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122&\b\u0002\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b*\u0010+\u001aÉ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b.\u0010/\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b0\u00101\u001a¥\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u00102\u001a\u0002032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b4\u00105\u001ae\u00106\u001a\u00020\u0001*\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020%H\u0007¢\u0006\u0002\u00109\u001a[\u00106\u001a\u00020\u0001*\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010:\u001a\u0095\u0001\u0010;\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122$\u0010\r\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0002\u0010<¨\u0006="}, d2 = {"SubcomposeAsyncImage", "", "model", "", "contentDescription", "", "imageLoader", "Lcoil/ImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "loading", "Lkotlin/Function2;", "Lcoil/compose/SubcomposeAsyncImageScope;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "success", "Lcoil/compose/AsyncImagePainter$State$Success;", "error", "Lcoil/compose/AsyncImagePainter$State$Error;", "onLoading", "onSuccess", "onError", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "clipToBounds", "", "modelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "SubcomposeAsyncImage-TCQMD7g", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "onState", "content", "SubcomposeAsyncImage-FSyRiR8", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLcoil/compose/EqualityDelegate;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImage-sKDTAoQ", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "state", "Lcoil/compose/AsyncImageState;", "SubcomposeAsyncImage-gl8XCv8", "(Lcoil/compose/AsyncImageState;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SubcomposeAsyncImageContent", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLandroidx/compose/runtime/Composer;II)V", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "contentOf", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function3;", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubcomposeAsyncImageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubcomposeAsyncImageContent$lambda$3(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, int i, int i2, Composer composer, int i3) {
        SubcomposeAsyncImageContent(subcomposeAsyncImageScope, modifier, painter, str, alignment, contentScale, f, colorFilter, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubcomposeAsyncImageContent$lambda$4(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, Composer composer, int i3) {
        SubcomposeAsyncImageContent(subcomposeAsyncImageScope, modifier, painter, str, alignment, contentScale, f, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubcomposeAsyncImage_gl8XCv8$lambda$1(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        m6760SubcomposeAsyncImagegl8XCv8(asyncImageState, str, modifier, function1, function12, alignment, contentScale, f, colorFilter, i, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* renamed from: SubcomposeAsyncImage-TCQMD7g, reason: not valid java name */
    public static final void m6759SubcomposeAsyncImageTCQMD7g(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43, Function1<? super AsyncImagePainter.State.Loading, Unit> function12, Function1<? super AsyncImagePainter.State.Success, Unit> function13, Function1<? super AsyncImagePainter.State.Error, Unit> function14, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, EqualityDelegate equalityDelegate, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-1545157471);
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function44 = (i4 & 32) != 0 ? null : function4;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function45 = (i4 & 64) != 0 ? null : function42;
        Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function46 = (i4 & 128) != 0 ? null : function43;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function15 = (i4 & 256) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Success, Unit> function16 = (i4 & 512) != 0 ? null : function13;
        Function1<? super AsyncImagePainter.State.Error, Unit> function17 = (i4 & 1024) != 0 ? null : function14;
        Alignment center = (i4 & 2048) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 4096) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 8192) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 16384) == 0 ? colorFilter : null;
        int m4402getDefaultFilterQualityfv9h1I = (32768 & i4) != 0 ? DrawScope.INSTANCE.m4402getDefaultFilterQualityfv9h1I() : i;
        boolean z2 = (65536 & i4) != 0 ? true : z;
        AsyncImageState asyncImageState = new AsyncImageState(obj, (i4 & 131072) != 0 ? EqualityDelegateKt.getDefaultModelEqualityDelegate() : equalityDelegate, imageLoader);
        Function1<AsyncImagePainter.State, Unit> onStateOf = UtilsKt.onStateOf(function15, function16, function17);
        Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> contentOf = contentOf(function44, function45, function46);
        int i5 = i2 >> 3;
        int i6 = (i2 & SdkConfig.SDK_VERSION) | (i5 & 896) | (i5 & 7168);
        int i7 = i3 << 12;
        m6760SubcomposeAsyncImagegl8XCv8(asyncImageState, str, companion, defaultTransform, onStateOf, center, fit, f2, colorFilter2, m4402getDefaultFilterQualityfv9h1I, z2, contentOf, composer, i6 | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), (i3 >> 18) & 14, 0);
        composer.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /* renamed from: SubcomposeAsyncImage-Q4Kwu38, reason: not valid java name */
    public static final /* synthetic */ void m6758SubcomposeAsyncImageQ4Kwu38(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function4 function4, Function4 function42, Function4 function43, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-976228417);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function4 function44 = (i4 & 16) != 0 ? null : function4;
        Function4 function45 = (i4 & 32) != 0 ? null : function42;
        Function4 function46 = (i4 & 64) != 0 ? null : function43;
        Function1 function14 = (i4 & 128) != 0 ? null : function1;
        Function1 function15 = (i4 & 256) != 0 ? null : function12;
        Function1 function16 = (i4 & 512) != 0 ? null : function13;
        Alignment center = (i4 & 1024) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 2048) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 4096) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 8192) != 0 ? null : colorFilter;
        int m4402getDefaultFilterQualityfv9h1I = (i4 & 16384) != 0 ? DrawScope.INSTANCE.m4402getDefaultFilterQualityfv9h1I() : i;
        AsyncImageState asyncImageState = new AsyncImageState(obj, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader);
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> defaultTransform = AsyncImagePainter.INSTANCE.getDefaultTransform();
        Function1<AsyncImagePainter.State, Unit> onStateOf = UtilsKt.onStateOf(function14, function15, function16);
        Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> contentOf = contentOf(function44, function45, function46);
        int i5 = i3 << 15;
        m6760SubcomposeAsyncImagegl8XCv8(asyncImageState, str, modifier2, defaultTransform, onStateOf, center, fit, f2, colorFilter2, m4402getDefaultFilterQualityfv9h1I, true, contentOf, composer, (i2 & SdkConfig.SDK_VERSION) | 3072 | ((i2 >> 3) & 896) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 6, 0);
        composer.endReplaceableGroup();
    }

    /* renamed from: SubcomposeAsyncImage-FSyRiR8, reason: not valid java name */
    public static final void m6757SubcomposeAsyncImageFSyRiR8(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, boolean z, EqualityDelegate equalityDelegate, Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-105413282);
        int i5 = i2 >> 3;
        m6760SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, (i4 & 4096) != 0 ? EqualityDelegateKt.getDefaultModelEqualityDelegate() : equalityDelegate, imageLoader), str, (i4 & 8) != 0 ? Modifier.INSTANCE : modifier, (i4 & 16) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1, (i4 & 32) != 0 ? null : function12, (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i4 & 256) != 0 ? 1.0f : f, (i4 & 512) != 0 ? null : colorFilter, (i4 & 1024) != 0 ? DrawScope.INSTANCE.m4402getDefaultFilterQualityfv9h1I() : i, (i4 & 2048) != 0 ? true : z, function3, composer, (i2 & SdkConfig.SDK_VERSION) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), ((i3 >> 3) & 14) | ((i3 >> 6) & SdkConfig.SDK_VERSION), 0);
        composer.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /* renamed from: SubcomposeAsyncImage-sKDTAoQ, reason: not valid java name */
    public static final /* synthetic */ void m6761SubcomposeAsyncImagesKDTAoQ(Object obj, String str, ImageLoader imageLoader, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Function3 function3, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1166576943);
        int i5 = i2 >> 3;
        m6760SubcomposeAsyncImagegl8XCv8(new AsyncImageState(obj, EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader), str, (i4 & 8) != 0 ? Modifier.INSTANCE : modifier, (i4 & 16) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1, (i4 & 32) != 0 ? null : function12, (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale, (i4 & 256) != 0 ? 1.0f : f, (i4 & 512) != 0 ? null : colorFilter, (i4 & 1024) != 0 ? DrawScope.INSTANCE.m4402getDefaultFilterQualityfv9h1I() : i, true, function3, composer, (i2 & SdkConfig.SDK_VERSION) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), (i3 & SdkConfig.SDK_VERSION) | 6, 0);
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fe  */
    /* renamed from: SubcomposeAsyncImage-gl8XCv8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m6760SubcomposeAsyncImagegl8XCv8(final AsyncImageState asyncImageState, final String str, Modifier modifier, final Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, final Function1<? super AsyncImagePainter.State, Unit> function12, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, final int i, final boolean z, final Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        final SizeResolver sizeResolver;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-605638725);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(asyncImageState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & SdkConfig.SDK_VERSION) == 0) {
            i5 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i2 & 458752) == 0) {
                        i6 = startRestartGroup.changed(alignment) ? 131072 : 65536;
                    }
                    if ((i4 & 64) != 0) {
                        i8 = (i2 & 3670016) == 0 ? startRestartGroup.changed(contentScale) ? 1048576 : 524288 : 1572864;
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((29360128 & i2) == 0) {
                            i5 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                            if ((i4 & 256) == 0) {
                                i5 |= 100663296;
                            } else if ((234881024 & i2) == 0) {
                                i5 |= startRestartGroup.changed(colorFilter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                if ((i4 & 512) != 0) {
                                    i5 |= 805306368;
                                } else if ((1879048192 & i2) == 0) {
                                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                                    if ((i4 & 1024) == 0) {
                                        i7 = i3 | 6;
                                    } else if ((i3 & 14) == 0) {
                                        i7 = i3 | (startRestartGroup.changed(z) ? 4 : 2);
                                    } else {
                                        i7 = i3;
                                    }
                                    if ((i4 & 2048) == 0) {
                                        i7 |= 48;
                                    } else if ((i3 & SdkConfig.SDK_VERSION) == 0) {
                                        i7 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                                    }
                                    if ((1533916891 & i5) == 306783378 || (i7 & 91) != 18 || !startRestartGroup.getSkipping()) {
                                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                        ImageRequest requestOfWithSizeResolver = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                                        int i10 = i5 >> 3;
                                        int i11 = i5 >> 6;
                                        int i12 = i5 >> 12;
                                        final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i10 & 7168) | (i10 & 896) | 72 | (i11 & 57344) | (i12 & 458752), 64);
                                        sizeResolver = requestOfWithSizeResolver.getSizeResolver();
                                        if (sizeResolver instanceof ConstraintsSizeResolver) {
                                            startRestartGroup.startReplaceableGroup(-2080018031);
                                            int i13 = (i11 & 14) | 384 | (i12 & SdkConfig.SDK_VERSION);
                                            startRestartGroup.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, true, startRestartGroup, ((i13 >> 3) & 14) | 48);
                                            startRestartGroup.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                                            Updater.m3343setimpl(m3336constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(SkippableUpdater.m3327boximpl(SkippableUpdater.m3328constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                            startRestartGroup.startReplaceableGroup(2058660585);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                            function3.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.INSTANCE, m6720rememberAsyncImagePainter0YpotYA, str, alignment, contentScale, f, colorFilter, z), startRestartGroup, Integer.valueOf(i7 & SdkConfig.SDK_VERSION));
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endNode();
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                        } else {
                                            startRestartGroup.startReplaceableGroup(-2079329304);
                                            BoxWithConstraintsKt.BoxWithConstraints(modifier4, alignment, true, ComposableLambdaKt.composableLambda(startRestartGroup, -888190719, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, int i14) {
                                                    if ((i14 & 14) == 0) {
                                                        i14 |= composer2.changed(boxWithConstraintsScope) ? 4 : 2;
                                                    }
                                                    if ((i14 & 91) != 18 || !composer2.getSkipping()) {
                                                        ((ConstraintsSizeResolver) SizeResolver.this).m6728setConstraintsBRTryo0(boxWithConstraintsScope.mo591getConstraintsmsEJaDk());
                                                        function3.invoke(new RealSubcomposeAsyncImageScope(boxWithConstraintsScope, m6720rememberAsyncImagePainter0YpotYA, str, alignment, contentScale, f, colorFilter, z), composer2, 0);
                                                    } else {
                                                        composer2.skipToGroupEnd();
                                                    }
                                                }
                                            }), startRestartGroup, (i11 & 14) | 3456 | (i12 & SdkConfig.SDK_VERSION), 0);
                                            startRestartGroup.endReplaceableGroup();
                                        }
                                        modifier3 = modifier4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier2;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: coil.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit SubcomposeAsyncImage_gl8XCv8$lambda$1;
                                                SubcomposeAsyncImage_gl8XCv8$lambda$1 = SubcomposeAsyncImageKt.SubcomposeAsyncImage_gl8XCv8$lambda$1(AsyncImageState.this, str, modifier3, function1, function12, alignment, contentScale, f, colorFilter, i, z, function3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return SubcomposeAsyncImage_gl8XCv8$lambda$1;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i4 & 1024) == 0) {
                                }
                                if ((i4 & 2048) == 0) {
                                }
                                if ((1533916891 & i5) == 306783378) {
                                }
                                if (i9 == 0) {
                                }
                                ImageRequest requestOfWithSizeResolver2 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                                int i102 = i5 >> 3;
                                int i112 = i5 >> 6;
                                int i122 = i5 >> 12;
                                final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA2 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver2, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i102 & 7168) | (i102 & 896) | 72 | (i112 & 57344) | (i122 & 458752), 64);
                                sizeResolver = requestOfWithSizeResolver2.getSizeResolver();
                                if (sizeResolver instanceof ConstraintsSizeResolver) {
                                }
                                modifier3 = modifier4;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            if ((i4 & 512) != 0) {
                            }
                            if ((i4 & 1024) == 0) {
                            }
                            if ((i4 & 2048) == 0) {
                            }
                            if ((1533916891 & i5) == 306783378) {
                            }
                            if (i9 == 0) {
                            }
                            ImageRequest requestOfWithSizeResolver22 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                            int i1022 = i5 >> 3;
                            int i1122 = i5 >> 6;
                            int i1222 = i5 >> 12;
                            final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA22 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver22, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i1022 & 7168) | (i1022 & 896) | 72 | (i1122 & 57344) | (i1222 & 458752), 64);
                            sizeResolver = requestOfWithSizeResolver22.getSizeResolver();
                            if (sizeResolver instanceof ConstraintsSizeResolver) {
                            }
                            modifier3 = modifier4;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if ((i4 & 256) == 0) {
                        }
                        if ((i4 & 512) != 0) {
                        }
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        if ((1533916891 & i5) == 306783378) {
                        }
                        if (i9 == 0) {
                        }
                        ImageRequest requestOfWithSizeResolver222 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                        int i10222 = i5 >> 3;
                        int i11222 = i5 >> 6;
                        int i12222 = i5 >> 12;
                        final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA222 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver222, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i10222 & 7168) | (i10222 & 896) | 72 | (i11222 & 57344) | (i12222 & 458752), 64);
                        sizeResolver = requestOfWithSizeResolver222.getSizeResolver();
                        if (sizeResolver instanceof ConstraintsSizeResolver) {
                        }
                        modifier3 = modifier4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i5 |= i8;
                    if ((i4 & 128) != 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    if ((i4 & 512) != 0) {
                    }
                    if ((i4 & 1024) == 0) {
                    }
                    if ((i4 & 2048) == 0) {
                    }
                    if ((1533916891 & i5) == 306783378) {
                    }
                    if (i9 == 0) {
                    }
                    ImageRequest requestOfWithSizeResolver2222 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                    int i102222 = i5 >> 3;
                    int i112222 = i5 >> 6;
                    int i122222 = i5 >> 12;
                    final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA2222 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver2222, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i102222 & 7168) | (i102222 & 896) | 72 | (i112222 & 57344) | (i122222 & 458752), 64);
                    sizeResolver = requestOfWithSizeResolver2222.getSizeResolver();
                    if (sizeResolver instanceof ConstraintsSizeResolver) {
                    }
                    modifier3 = modifier4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i5 |= i6;
                if ((i4 & 64) != 0) {
                }
                i5 |= i8;
                if ((i4 & 128) != 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if ((i4 & 512) != 0) {
                }
                if ((i4 & 1024) == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                if ((1533916891 & i5) == 306783378) {
                }
                if (i9 == 0) {
                }
                ImageRequest requestOfWithSizeResolver22222 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
                int i1022222 = i5 >> 3;
                int i1122222 = i5 >> 6;
                int i1222222 = i5 >> 12;
                final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA22222 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver22222, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i1022222 & 7168) | (i1022222 & 896) | 72 | (i1122222 & 57344) | (i1222222 & 458752), 64);
                sizeResolver = requestOfWithSizeResolver22222.getSizeResolver();
                if (sizeResolver instanceof ConstraintsSizeResolver) {
                }
                modifier3 = modifier4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            i5 |= i6;
            if ((i4 & 64) != 0) {
            }
            i5 |= i8;
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            if ((1533916891 & i5) == 306783378) {
            }
            if (i9 == 0) {
            }
            ImageRequest requestOfWithSizeResolver222222 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
            int i10222222 = i5 >> 3;
            int i11222222 = i5 >> 6;
            int i12222222 = i5 >> 12;
            final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA222222 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver222222, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i10222222 & 7168) | (i10222222 & 896) | 72 | (i11222222 & 57344) | (i12222222 & 458752), 64);
            sizeResolver = requestOfWithSizeResolver222222.getSizeResolver();
            if (sizeResolver instanceof ConstraintsSizeResolver) {
            }
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        i5 |= i6;
        if ((i4 & 64) != 0) {
        }
        i5 |= i8;
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        if ((1533916891 & i5) == 306783378) {
        }
        if (i9 == 0) {
        }
        ImageRequest requestOfWithSizeResolver2222222 = UtilsKt.requestOfWithSizeResolver(asyncImageState.getModel(), contentScale, startRestartGroup, ((i5 >> 15) & SdkConfig.SDK_VERSION) | 8);
        int i102222222 = i5 >> 3;
        int i112222222 = i5 >> 6;
        int i122222222 = i5 >> 12;
        final AsyncImagePainter m6720rememberAsyncImagePainter0YpotYA2222222 = AsyncImagePainterKt.m6720rememberAsyncImagePainter0YpotYA(requestOfWithSizeResolver2222222, asyncImageState.getImageLoader(), function1, function12, contentScale, i, null, startRestartGroup, (i102222222 & 7168) | (i102222222 & 896) | 72 | (i112222222 & 57344) | (i122222222 & 458752), 64);
        sizeResolver = requestOfWithSizeResolver2222222.getSizeResolver();
        if (sizeResolver instanceof ConstraintsSizeResolver) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubcomposeAsyncImageContent(final SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f2;
        ColorFilter colorFilter2;
        boolean z2;
        AsyncImagePainter painter2;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        final Painter painter3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(880638523);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & SdkConfig.SDK_VERSION) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 4) == 0) {
                    str2 = str;
                    if (startRestartGroup.changed(str2)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    str2 = str;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                str2 = str;
            }
            if ((57344 & i) != 0) {
                if ((i2 & 8) == 0) {
                    alignment2 = alignment;
                    if (startRestartGroup.changed(alignment2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    alignment2 = alignment;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                alignment2 = alignment;
            }
            if ((458752 & i) != 0) {
                if ((i2 & 16) == 0) {
                    contentScale2 = contentScale;
                    if (startRestartGroup.changed(contentScale2)) {
                        i8 = 131072;
                        i3 |= i8;
                    }
                } else {
                    contentScale2 = contentScale;
                }
                i8 = 65536;
                i3 |= i8;
            } else {
                contentScale2 = contentScale;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i7 = 1048576;
                        i3 |= i7;
                    }
                } else {
                    f2 = f;
                }
                i7 = 524288;
                i3 |= i7;
            } else {
                f2 = f;
            }
            if ((29360128 & i) != 0) {
                if ((i2 & 64) == 0) {
                    colorFilter2 = colorFilter;
                    if (startRestartGroup.changed(colorFilter2)) {
                        i6 = 8388608;
                        i3 |= i6;
                    }
                } else {
                    colorFilter2 = colorFilter;
                }
                i6 = 4194304;
                i3 |= i6;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((234881024 & i) != 0) {
                if ((i2 & 128) == 0) {
                    z2 = z;
                    if (startRestartGroup.changed(z2)) {
                        i5 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i3 |= i5;
                    }
                } else {
                    z2 = z;
                }
                i5 = 33554432;
                i3 |= i5;
            } else {
                z2 = z;
            }
            if (i4 == 2 || (191739611 & i3) != 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    painter2 = i4 == 0 ? subcomposeAsyncImageScope.getPainter() : painter;
                    if ((i2 & 4) != 0) {
                        str2 = subcomposeAsyncImageScope.getContentDescription();
                    }
                    if ((i2 & 8) != 0) {
                        alignment2 = subcomposeAsyncImageScope.getAlignment();
                    }
                    if ((i2 & 16) != 0) {
                        contentScale2 = subcomposeAsyncImageScope.getContentScale();
                    }
                    if ((i2 & 32) != 0) {
                        f2 = subcomposeAsyncImageScope.getAlpha();
                    }
                    if ((i2 & 64) != 0) {
                        colorFilter2 = subcomposeAsyncImageScope.getColorFilter();
                    }
                    if ((i2 & 128) != 0) {
                        z2 = subcomposeAsyncImageScope.getClipToBounds();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    painter2 = painter;
                }
                startRestartGroup.endDefaults();
                Modifier contentDescription = UtilsKt.contentDescription(modifier2, str2);
                if (z2) {
                    contentDescription = ClipKt.clipToBounds(contentDescription);
                }
                Modifier then = contentDescription.then(new ContentPainterElement(painter2, alignment2, contentScale2, f2, colorFilter2));
                SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 subcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 = SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2.INSTANCE;
                startRestartGroup.startReplaceableGroup(544976794);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Painter painter4 = painter2;
                startRestartGroup.startReplaceableGroup(1405779621);
                ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final ComposeUiNode invoke() {
                            return Function0.this.invoke();
                        }
                    });
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, subcomposeAsyncImageKt$SubcomposeAsyncImageContent$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                painter3 = painter4;
            } else {
                startRestartGroup.skipToGroupEnd();
                painter3 = painter;
            }
            final Modifier modifier3 = modifier2;
            final String str3 = str2;
            final Alignment alignment3 = alignment2;
            final ContentScale contentScale3 = contentScale2;
            final float f3 = f2;
            final ColorFilter colorFilter3 = colorFilter2;
            final boolean z3 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: coil.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SubcomposeAsyncImageContent$lambda$3;
                        SubcomposeAsyncImageContent$lambda$3 = SubcomposeAsyncImageKt.SubcomposeAsyncImageContent$lambda$3(SubcomposeAsyncImageScope.this, modifier3, painter3, str3, alignment3, contentScale3, f3, colorFilter3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SubcomposeAsyncImageContent$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((234881024 & i) != 0) {
        }
        if (i4 == 2) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        startRestartGroup.endDefaults();
        Modifier contentDescription2 = UtilsKt.contentDescription(modifier2, str2);
        if (z2) {
        }
        Modifier then2 = contentDescription2.then(new ContentPainterElement(painter2, alignment2, contentScale2, f2, colorFilter2));
        SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2 subcomposeAsyncImageKt$SubcomposeAsyncImageContent$22 = SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2.INSTANCE;
        startRestartGroup.startReplaceableGroup(544976794);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        final Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Painter painter42 = painter2;
        startRestartGroup.startReplaceableGroup(1405779621);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, subcomposeAsyncImageKt$SubcomposeAsyncImageContent$22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        painter3 = painter42;
        final Modifier modifier32 = modifier2;
        final String str32 = str2;
        final Alignment alignment32 = alignment2;
        final ContentScale contentScale32 = contentScale2;
        final float f32 = f2;
        final ColorFilter colorFilter32 = colorFilter2;
        final boolean z32 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SubcomposeAsyncImageContent(final SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f2;
        ColorFilter colorFilter2;
        AsyncImagePainter asyncImagePainter;
        ColorFilter colorFilter3;
        ContentScale contentScale3;
        float f3;
        final ColorFilter colorFilter4;
        final Painter painter2;
        final Modifier modifier3;
        final Alignment alignment3;
        final ContentScale contentScale4;
        final String str3;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-263982313);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & SdkConfig.SDK_VERSION) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 4) == 0) {
                    str2 = str;
                    if (startRestartGroup.changed(str2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    str2 = str;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                str2 = str;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 8) == 0) {
                    alignment2 = alignment;
                    if (startRestartGroup.changed(alignment2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    alignment2 = alignment;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                alignment2 = alignment;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 16) == 0) {
                    contentScale2 = contentScale;
                    if (startRestartGroup.changed(contentScale2)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    contentScale2 = contentScale;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                contentScale2 = contentScale;
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    f2 = f;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                f2 = f;
            }
            if ((i & 29360128) != 0) {
                colorFilter2 = colorFilter;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(colorFilter2)) ? 8388608 : 4194304;
            } else {
                colorFilter2 = colorFilter;
            }
            if (i4 == 2 || (23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 == 0) {
                        asyncImagePainter = subcomposeAsyncImageScope.getPainter();
                        i3 &= -897;
                    } else {
                        asyncImagePainter = painter;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                        str2 = subcomposeAsyncImageScope.getContentDescription();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                        alignment2 = subcomposeAsyncImageScope.getAlignment();
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                        contentScale2 = subcomposeAsyncImageScope.getContentScale();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                        f2 = subcomposeAsyncImageScope.getAlpha();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -29360129;
                        colorFilter3 = subcomposeAsyncImageScope.getColorFilter();
                        contentScale3 = contentScale2;
                        f3 = f2;
                        Alignment alignment4 = alignment2;
                        int i10 = i3;
                        startRestartGroup.endDefaults();
                        SubcomposeAsyncImageContent(subcomposeAsyncImageScope, modifier2, asyncImagePainter, str2, alignment4, contentScale3, f3, colorFilter3, false, startRestartGroup, (57344 & i10) | (i10 & 14) | 512 | (i10 & SdkConfig.SDK_VERSION) | (i10 & 7168) | (458752 & i10) | (3670016 & i10) | (i10 & 29360128), 128);
                        colorFilter4 = colorFilter3;
                        painter2 = asyncImagePainter;
                        modifier3 = modifier2;
                        alignment3 = alignment4;
                        float f5 = f3;
                        contentScale4 = contentScale3;
                        str3 = str2;
                        f4 = f5;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -29360129;
                    }
                    asyncImagePainter = painter;
                }
                contentScale3 = contentScale2;
                f3 = f2;
                colorFilter3 = colorFilter2;
                Alignment alignment42 = alignment2;
                int i102 = i3;
                startRestartGroup.endDefaults();
                SubcomposeAsyncImageContent(subcomposeAsyncImageScope, modifier2, asyncImagePainter, str2, alignment42, contentScale3, f3, colorFilter3, false, startRestartGroup, (57344 & i102) | (i102 & 14) | 512 | (i102 & SdkConfig.SDK_VERSION) | (i102 & 7168) | (458752 & i102) | (3670016 & i102) | (i102 & 29360128), 128);
                colorFilter4 = colorFilter3;
                painter2 = asyncImagePainter;
                modifier3 = modifier2;
                alignment3 = alignment42;
                float f52 = f3;
                contentScale4 = contentScale3;
                str3 = str2;
                f4 = f52;
            } else {
                startRestartGroup.skipToGroupEnd();
                painter2 = painter;
                modifier3 = modifier2;
                str3 = str2;
                alignment3 = alignment2;
                contentScale4 = contentScale2;
                f4 = f2;
                colorFilter4 = colorFilter2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: coil.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SubcomposeAsyncImageContent$lambda$4;
                        SubcomposeAsyncImageContent$lambda$4 = SubcomposeAsyncImageKt.SubcomposeAsyncImageContent$lambda$4(SubcomposeAsyncImageScope.this, modifier3, painter2, str3, alignment3, contentScale4, f4, colorFilter4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SubcomposeAsyncImageContent$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if (i4 == 2) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        contentScale3 = contentScale2;
        f3 = f2;
        colorFilter3 = colorFilter2;
        Alignment alignment422 = alignment2;
        int i1022 = i3;
        startRestartGroup.endDefaults();
        SubcomposeAsyncImageContent(subcomposeAsyncImageScope, modifier2, asyncImagePainter, str2, alignment422, contentScale3, f3, colorFilter3, false, startRestartGroup, (57344 & i1022) | (i1022 & 14) | 512 | (i1022 & SdkConfig.SDK_VERSION) | (i1022 & 7168) | (458752 & i1022) | (3670016 & i1022) | (i1022 & 29360128), 128);
        colorFilter4 = colorFilter3;
        painter2 = asyncImagePainter;
        modifier3 = modifier2;
        alignment3 = alignment422;
        float f522 = f3;
        contentScale4 = contentScale3;
        str3 = str2;
        f4 = f522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> contentOf(final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43) {
        return (function4 == null && function42 == null && function43 == null) ? ComposableSingletons$SubcomposeAsyncImageKt.INSTANCE.m6727getLambda1$coil_compose_base_release() : ComposableLambdaKt.composableLambdaInstance(750771424, true, new Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$contentOf$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
                invoke(subcomposeAsyncImageScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i) {
                int i2;
                if ((i & 14) == 0) {
                    i2 = i | (composer.changed(subcomposeAsyncImageScope) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 91) != 18 || !composer.getSkipping()) {
                    AsyncImagePainter.State state = subcomposeAsyncImageScope.getPainter().getState();
                    boolean z = false;
                    boolean z2 = true;
                    if (state instanceof AsyncImagePainter.State.Loading) {
                        composer.startReplaceableGroup(1739512213);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> function44 = function4;
                        if (function44 != 0) {
                            function44.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    } else if (state instanceof AsyncImagePainter.State.Success) {
                        composer.startReplaceableGroup(1739605461);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> function45 = function42;
                        if (function45 != 0) {
                            function45.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Error)) {
                            if (!(state instanceof AsyncImagePainter.State.Empty)) {
                                composer.startReplaceableGroup(-82435959);
                                composer.endReplaceableGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceableGroup(1739782316);
                            composer.endReplaceableGroup();
                            if (z2) {
                                return;
                            }
                            SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, i2 & 14, 255);
                            return;
                        }
                        composer.startReplaceableGroup(1739696601);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> function46 = function43;
                        if (function46 != 0) {
                            function46.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    }
                    z2 = z;
                    if (z2) {
                    }
                } else {
                    composer.skipToGroupEnd();
                }
            }
        });
    }
}
