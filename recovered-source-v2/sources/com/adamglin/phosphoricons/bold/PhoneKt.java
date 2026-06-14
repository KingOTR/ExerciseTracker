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

/* compiled from: Phone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPhone", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneKt {
    private static ImageVector _phone;

    public static final ImageVector getPhone(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 154.8f);
        pathBuilder.lineToRelative(-47.09f, -21.11f);
        pathBuilder.lineToRelative(-0.18f, -0.08f);
        pathBuilder.arcToRelative(19.94f, 19.94f, 0.0f, false, false, -19.0f, 1.75f);
        pathBuilder.arcToRelative(13.08f, 13.08f, 0.0f, false, false, -1.12f, 0.84f);
        pathBuilder.lineToRelative(-22.31f, 19.0f);
        pathBuilder.curveToRelative(-13.0f, -7.05f, -26.43f, -20.37f, -33.49f, -33.21f);
        pathBuilder.lineToRelative(19.06f, -22.66f);
        pathBuilder.arcToRelative(11.76f, 11.76f, 0.0f, false, false, 0.85f, -1.15f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.66f, -18.83f);
        pathBuilder.arcToRelative(1.42f, 1.42f, 0.0f, false, true, -0.08f, -0.18f);
        pathBuilder.lineTo(101.2f, 32.0f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 80.42f, 20.15f);
        pathBuilder.arcTo(60.27f, 60.27f, 0.0f, false, false, 28.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 81.61f, 66.39f, 148.0f, 148.0f, 148.0f);
        pathBuilder.arcToRelative(60.27f, 60.27f, 0.0f, false, false, 59.85f, -52.42f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 224.0f, 154.8f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 204.0f);
        pathBuilder.arcTo(124.15f, 124.15f, 0.0f, false, true, 52.0f, 80.0f);
        pathBuilder.arcTo(36.29f, 36.29f, 0.0f, false, true, 80.48f, 44.46f);
        pathBuilder.lineToRelative(18.82f, 42.0f);
        pathBuilder.lineTo(80.14f, 109.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.86f, 1.16f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 78.0f, 130.08f);
        pathBuilder.curveToRelative(9.42f, 19.28f, 28.83f, 38.56f, 48.31f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 146.0f, 176.63f);
        pathBuilder.arcToRelative(11.63f, 11.63f, 0.0f, false, false, 1.11f, -0.85f);
        pathBuilder.lineToRelative(22.43f, -19.07f);
        pathBuilder.lineToRelative(42.0f, 18.81f);
        pathBuilder.arcTo(36.29f, 36.29f, 0.0f, false, true, 176.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
