package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pipewrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PipeWrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPipeWrench", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipeWrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipewrenchKt {
    private static ImageVector _pipeWrench;

    public static final ImageVector getPipeWrench(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pipeWrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PipeWrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.11f, 40.2f);
        pathBuilder.lineToRelative(-0.36f, -0.35f);
        pathBuilder.lineTo(185.92f, 9.64f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.0f, 0.19f);
        pathBuilder.lineTo(110.36f, 57.11f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.46f, 45.0f);
        pathBuilder.lineToRelative(-15.06f, 15.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f);
        pathBuilder.lineToRelative(17.72f, 17.72f);
        pathBuilder.lineToRelative(-30.2f, 30.2f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(91.51f, -92.32f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.38f, -28.61f);
        pathBuilder.lineToRelative(-13.0f, -12.4f);
        pathBuilder.lineToRelative(11.91f, -11.8f);
        pathBuilder.lineToRelative(14.73f, 13.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.0f, -0.33f);
        pathBuilder.lineToRelative(3.71f, -3.71f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -62.23f);
        pathBuilder.close();
        pathBuilder.moveTo(69.65f, 131.32f);
        pathBuilder.lineToRelative(12.21f, -12.19f);
        pathBuilder.lineTo(96.73f, 134.0f);
        pathBuilder.lineToRelative(-12.2f, 12.21f);
        pathBuilder.close();
        pathBuilder.moveTo(65.65f, 221.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.33f);
        pathBuilder.lineToRelative(67.86f, -67.86f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineTo(82.33f, 85.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 93.65f, 74.34f);
        pathBuilder.curveToRelative(0.06f, 0.07f, 0.13f, 0.13f, 0.19f, 0.19f);
        pathBuilder.lineToRelative(60.44f, 57.72f);
        pathBuilder.close();
        pathBuilder.moveTo(202.14f, 85.46f);
        pathBuilder.lineToRelative(-1.0f, 1.0f);
        pathBuilder.lineTo(186.27f, 73.44f);
        pathBuilder.arcToRelative(20.06f, 20.06f, 0.0f, false, false, -27.82f, 0.38f);
        pathBuilder.lineToRelative(-15.0f, 14.88f);
        pathBuilder.lineToRelative(-15.72f, -15.0f);
        pathBuilder.lineTo(172.1f, 29.53f);
        pathBuilder.lineToRelative(30.19f, 27.8f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -0.15f, 28.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipeWrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
