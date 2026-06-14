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

/* compiled from: Phone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPhone", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneKt {
    private static ImageVector _phone;

    public static final ImageVector getPhone(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _phone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Phone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.94f, 174.08f);
        pathBuilder.arcTo(48.33f, 48.33f, 0.0f, false, true, 176.0f, 216.0f);
        pathBuilder.arcTo(136.0f, 136.0f, 0.0f, false, true, 40.0f, 80.0f);
        pathBuilder.arcTo(48.33f, 48.33f, 0.0f, false, true, 81.92f, 32.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, 4.8f);
        pathBuilder.lineToRelative(21.13f, 47.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.66f, 7.53f);
        pathBuilder.lineTo(89.32f, 117.0f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, -0.54f, 7.81f);
        pathBuilder.curveToRelative(8.27f, 16.93f, 25.77f, 34.22f, 42.75f, 42.41f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 7.83f, -0.59f);
        pathBuilder.lineToRelative(25.0f, -21.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.59f, -0.69f);
        pathBuilder.lineToRelative(47.16f, 21.13f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.94f, 174.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(222.37f, 158.46f);
        pathBuilder2.lineToRelative(-47.11f, -21.11f);
        pathBuilder2.lineToRelative(-0.13f, -0.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.17f, 1.4f);
        pathBuilder2.arcToRelative(8.12f, 8.12f, 0.0f, false, false, -0.75f, 0.56f);
        pathBuilder2.lineTo(134.87f, 160.0f);
        pathBuilder2.curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f);
        pathBuilder2.lineToRelative(20.78f, -24.71f);
        pathBuilder2.curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.32f, -15.06f);
        pathBuilder2.lineToRelative(0.0f, -0.12f);
        pathBuilder2.lineTo(97.54f, 33.64f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.62f, -9.52f);
        pathBuilder2.arcTo(56.26f, 56.26f, 0.0f, false, false, 32.0f, 80.0f);
        pathBuilder2.curveToRelative(0.0f, 79.4f, 64.6f, 144.0f, 144.0f, 144.0f);
        pathBuilder2.arcToRelative(56.26f, 56.26f, 0.0f, false, false, 55.88f, -48.92f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 222.37f, 158.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 208.0f);
        pathBuilder2.arcTo(128.14f, 128.14f, 0.0f, false, true, 48.0f, 80.0f);
        pathBuilder2.arcTo(40.2f, 40.2f, 0.0f, false, true, 82.87f, 40.0f);
        pathBuilder2.arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f);
        pathBuilder2.lineToRelative(21.0f, 47.0f);
        pathBuilder2.lineTo(83.2f, 111.86f);
        pathBuilder2.arcToRelative(6.13f, 6.13f, 0.0f, false, false, -0.57f, 0.77f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, 15.7f);
        pathBuilder2.curveToRelative(9.06f, 18.53f, 27.73f, 37.06f, 46.46f, 46.11f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.75f, -1.14f);
        pathBuilder2.arcToRelative(8.44f, 8.44f, 0.0f, false, false, 0.74f, -0.56f);
        pathBuilder2.lineTo(168.89f, 152.0f);
        pathBuilder2.lineToRelative(47.0f, 21.05f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.reflectiveCurveToRelative(0.08f, 0.0f, 0.11f, 0.0f);
        pathBuilder2.arcTo(40.21f, 40.21f, 0.0f, false, true, 176.0f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
