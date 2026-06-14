package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flagcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFlagCheckered", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagcheckeredKt {
    private static ImageVector _flagCheckered;

    public static final ImageVector getFlagCheckered(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _flagCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.32f, 48.75f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 218.76f, 50.0f);
        pathBuilder.curveToRelative(-28.0f, 24.22f, -51.72f, 12.48f, -79.21f, -1.13f);
        pathBuilder.curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(179.77f);
        pathBuilder.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f);
        pathBuilder.curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f);
        pathBuilder.curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 227.32f, 48.75f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 160.44f);
        pathBuilder.verticalLineTo(109.88f);
        pathBuilder.curveToRelative(16.85f, -11.28f, 32.64f, -11.59f, 48.0f, -7.34f);
        pathBuilder.verticalLineToRelative(51.74f);
        pathBuilder.curveTo(88.87f, 150.47f, 72.87f, 150.71f, 56.0f, 160.44f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 50.87f);
        pathBuilder.curveToRelative(9.25f, 2.83f, 18.61f, 7.45f, 28.45f, 12.32f);
        pathBuilder.curveToRelative(11.26f, 5.57f, 23.11f, 11.43f, 35.55f, 14.56f);
        pathBuilder.verticalLineToRelative(51.74f);
        pathBuilder.curveToRelative(15.35f, 4.25f, 31.14f, 3.94f, 48.0f, -7.35f);
        pathBuilder.verticalLineToRelative(50.11f);
        pathBuilder.curveToRelative(-16.87f, 13.32f, -32.27f, 13.72f, -48.0f, 8.91f);
        pathBuilder.verticalLineTo(129.49f);
        pathBuilder.curveToRelative(-21.62f, -6.0f, -42.38f, -21.0f, -64.0f, -26.95f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
