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

/* compiled from: Phone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPhone", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneKt {
    private static ImageVector _phone;

    public static final ImageVector getPhone(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(231.88f, 175.08f);
        pathBuilder.arcTo(56.26f, 56.26f, 0.0f, false, true, 176.0f, 224.0f);
        pathBuilder.curveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f);
        pathBuilder.arcTo(56.26f, 56.26f, 0.0f, false, true, 80.92f, 24.12f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f);
        pathBuilder.lineToRelative(21.12f, 47.15f);
        pathBuilder.lineToRelative(0.0f, 0.12f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 117.39f, 96.0f);
        pathBuilder.curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f);
        pathBuilder.lineTo(96.0f, 121.45f);
        pathBuilder.curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f);
        pathBuilder.lineToRelative(24.34f, -20.71f);
        pathBuilder.arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f);
        pathBuilder.lineToRelative(0.13f, 0.06f);
        pathBuilder.lineToRelative(47.11f, 21.11f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 231.88f, 175.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
