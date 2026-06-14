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

/* compiled from: Phonepause.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhonePause", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPhonePause", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phonePause", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonepauseKt {
    private static ImageVector _phonePause;

    public static final ImageVector getPhonePause(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _phonePause;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhonePause", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 162.8f);
        pathBuilder.lineToRelative(-47.09f, -21.1f);
        pathBuilder.lineToRelative(-0.18f, -0.08f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, -19.0f, 1.74f);
        pathBuilder.arcToRelative(13.08f, 13.08f, 0.0f, false, false, -1.12f, 0.84f);
        pathBuilder.lineToRelative(-22.31f, 19.0f);
        pathBuilder.curveToRelative(-13.0f, -7.05f, -26.43f, -20.37f, -33.49f, -33.21f);
        pathBuilder.lineToRelative(19.06f, -22.66f);
        pathBuilder.arcToRelative(10.67f, 10.67f, 0.0f, false, false, 0.85f, -1.15f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.66f, -18.83f);
        pathBuilder.lineToRelative(-0.08f, -0.18f);
        pathBuilder.lineTo(93.2f, 40.0f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 72.42f, 28.15f);
        pathBuilder.arcTo(60.27f, 60.27f, 0.0f, false, false, 20.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 81.61f, 66.39f, 148.0f, 148.0f, 148.0f);
        pathBuilder.arcToRelative(60.27f, 60.27f, 0.0f, false, false, 59.85f, -52.42f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 216.0f, 162.8f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 212.0f);
        pathBuilder.arcTo(124.15f, 124.15f, 0.0f, false, true, 44.0f, 88.0f);
        pathBuilder.arcTo(36.27f, 36.27f, 0.0f, false, true, 72.48f, 52.47f);
        pathBuilder.lineToRelative(18.82f, 42.0f);
        pathBuilder.lineToRelative(-19.16f, 22.8f);
        pathBuilder.arcToRelative(10.75f, 10.75f, 0.0f, false, false, -0.86f, 1.15f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 70.0f, 138.08f);
        pathBuilder.curveToRelative(9.42f, 19.28f, 28.83f, 38.56f, 48.31f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 138.0f, 184.63f);
        pathBuilder.arcToRelative(11.63f, 11.63f, 0.0f, false, false, 1.11f, -0.85f);
        pathBuilder.lineToRelative(22.43f, -19.07f);
        pathBuilder.lineToRelative(42.0f, 18.81f);
        pathBuilder.arcTo(36.29f, 36.29f, 0.0f, false, true, 168.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 104.0f);
        pathBuilder.lineTo(188.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 104.0f);
        pathBuilder.lineTo(148.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phonePause = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
