package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Phonetransfer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneTransfer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPhoneTransfer", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneTransfer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonetransferKt {
    private static ImageVector _phoneTransfer;

    public static final ImageVector getPhoneTransfer(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _phoneTransfer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneTransfer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(215.94f, 182.08f);
        pathBuilder.arcTo(48.33f, 48.33f, 0.0f, false, true, 168.0f, 224.0f);
        pathBuilder.arcTo(136.0f, 136.0f, 0.0f, false, true, 32.0f, 88.0f);
        pathBuilder.arcTo(48.33f, 48.33f, 0.0f, false, true, 73.92f, 40.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 4.8f);
        pathBuilder.lineToRelative(21.13f, 47.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.66f, 7.53f);
        pathBuilder.lineTo(81.32f, 125.0f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, -0.54f, 7.81f);
        pathBuilder.curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 7.83f, -0.59f);
        pathBuilder.lineToRelative(25.0f, -21.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.59f, -0.69f);
        pathBuilder.lineToRelative(47.16f, 21.13f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 215.94f, 182.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(136.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(52.69f);
        pathBuilder2.lineTo(178.34f, 45.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineToRelative(32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(-32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineTo(196.69f, 80.0f);
        pathBuilder2.lineTo(144.0f, 80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(223.87f, 183.08f);
        pathBuilder2.arcTo(56.24f, 56.24f, 0.0f, false, true, 168.0f, 232.0f);
        pathBuilder2.curveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f);
        pathBuilder2.arcTo(56.24f, 56.24f, 0.0f, false, true, 72.92f, 32.13f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.51f);
        pathBuilder2.lineToRelative(21.12f, 47.15f);
        pathBuilder2.lineToRelative(0.0f, 0.12f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 109.39f, 104.0f);
        pathBuilder2.curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f);
        pathBuilder2.lineTo(88.0f, 129.45f);
        pathBuilder2.curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f);
        pathBuilder2.lineToRelative(24.34f, -20.71f);
        pathBuilder2.arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.18f, -1.4f);
        pathBuilder2.lineToRelative(0.11f, 0.06f);
        pathBuilder2.lineToRelative(47.11f, 21.11f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 223.87f, 183.08f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 181.08f);
        pathBuilder2.reflectiveCurveToRelative(-0.07f, 0.0f, -0.11f, 0.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(-47.0f, -21.05f);
        pathBuilder2.lineToRelative(-24.35f, 20.71f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.74f, 0.56f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.75f, 1.14f);
        pathBuilder2.curveToRelative(-18.73f, -9.0f, -37.4f, -27.58f, -46.46f, -46.11f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.0f, -15.7f);
        pathBuilder2.arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.57f, -0.77f);
        pathBuilder2.lineTo(96.0f, 95.15f);
        pathBuilder2.lineToRelative(-21.0f, -47.0f);
        pathBuilder2.arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.0f, -0.12f);
        pathBuilder2.arcTo(40.2f, 40.2f, 0.0f, false, false, 40.0f, 88.0f);
        pathBuilder2.arcTo(128.14f, 128.14f, 0.0f, false, false, 168.0f, 216.0f);
        pathBuilder2.arcTo(40.21f, 40.21f, 0.0f, false, false, 208.0f, 181.07f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneTransfer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
