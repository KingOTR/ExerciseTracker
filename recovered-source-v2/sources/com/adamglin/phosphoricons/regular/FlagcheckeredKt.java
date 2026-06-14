package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flagcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlagCheckered", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagcheckeredKt {
    private static ImageVector _flagCheckered;

    public static final ImageVector getFlagCheckered(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f);
        pathBuilder.lineTo(40.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(56.0f, 179.77f);
        pathBuilder.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f);
        pathBuilder.curveToRelative(28.49f, 14.09f, 60.77f, 30.06f, 96.79f, -1.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f);
        pathBuilder.lineTo(232.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 227.32f, 48.75f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 71.6f);
        pathBuilder.verticalLineToRelative(40.65f);
        pathBuilder.curveToRelative(-14.0f, 11.06f, -27.0f, 13.22f, -40.0f, 10.88f);
        pathBuilder.lineTo(176.0f, 79.34f);
        pathBuilder.arcTo(60.05f, 60.05f, 0.0f, false, false, 216.0f, 71.6f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 75.36f);
        pathBuilder.verticalLineToRelative(43.0f);
        pathBuilder.curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.48f);
        pathBuilder.curveToRelative(-8.82f, -4.37f, -18.0f, -8.91f, -27.55f, -12.18f);
        pathBuilder.verticalLineToRelative(-43.0f);
        pathBuilder.curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f);
        pathBuilder.curveTo(141.27f, 67.55f, 150.46f, 72.09f, 160.0f, 75.36f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 48.91f);
        pathBuilder.lineTo(96.0f, 92.69f);
        pathBuilder.arcToRelative(60.06f, 60.06f, 0.0f, false, false, -40.0f, 7.75f);
        pathBuilder.lineTo(56.0f, 59.78f);
        pathBuilder.curveTo(70.0f, 48.72f, 83.0f, 46.57f, 96.0f, 48.91f);
        pathBuilder.close();
        pathBuilder.moveTo(86.58f, 152.0f);
        pathBuilder.arcTo(60.06f, 60.06f, 0.0f, false, false, 56.0f, 160.43f);
        pathBuilder.lineTo(56.0f, 119.78f);
        pathBuilder.curveToRelative(14.0f, -11.06f, 27.0f, -13.22f, 40.0f, -10.88f);
        pathBuilder.verticalLineToRelative(43.8f);
        pathBuilder.arcTo(65.61f, 65.61f, 0.0f, false, false, 86.58f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 156.67f);
        pathBuilder.verticalLineToRelative(-43.0f);
        pathBuilder.curveToRelative(6.66f, 2.66f, 13.43f, 6.0f, 20.45f, 9.48f);
        pathBuilder.curveToRelative(8.82f, 4.37f, 18.0f, 8.9f, 27.55f, 12.17f);
        pathBuilder.verticalLineToRelative(43.0f);
        pathBuilder.curveToRelative(-6.66f, -2.67f, -13.43f, -6.0f, -20.45f, -9.48f);
        pathBuilder.curveTo(130.73f, 164.47f, 121.54f, 159.94f, 112.0f, 156.67f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 183.12f);
        pathBuilder.verticalLineToRelative(-43.8f);
        pathBuilder.arcToRelative(65.61f, 65.61f, 0.0f, false, false, 9.42f, 0.72f);
        pathBuilder.arcTo(60.11f, 60.11f, 0.0f, false, false, 216.0f, 131.57f);
        pathBuilder.verticalLineToRelative(40.68f);
        pathBuilder.curveTo(202.0f, 183.31f, 189.0f, 185.46f, 176.0f, 183.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
