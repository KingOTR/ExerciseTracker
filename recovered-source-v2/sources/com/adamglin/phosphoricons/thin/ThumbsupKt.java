package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Thumbsup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThumbsUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getThumbsUp", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thumbsUp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThumbsupKt {
    private static ImageVector _thumbsUp;

    public static final ImageVector getThumbsUp(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _thumbsUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThumbsUp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.0f, 82.76f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 76.0f);
        pathBuilder.horizontalLineTo(156.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f);
        pathBuilder.lineTo(77.53f, 100.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -17.52f);
        pathBuilder.lineToRelative(12.0f, -96.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 231.0f, 82.76f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 204.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineTo(76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.91f, 97.49f);
        pathBuilder.lineToRelative(-12.0f, 96.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 204.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.verticalLineTo(104.94f);
        pathBuilder.lineTo(122.42f, 28.1f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 148.0f, 56.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.91f, 13.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thumbsUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
