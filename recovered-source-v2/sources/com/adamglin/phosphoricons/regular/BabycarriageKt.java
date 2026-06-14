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

/* compiled from: Babycarriage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BabyCarriage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBabyCarriage", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_babyCarriage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BabycarriageKt {
    private static ImageVector _babyCarriage;

    public static final ImageVector getBabyCarriage(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _babyCarriage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BabyCarriage", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(55.2f, 104.0f);
        pathBuilder.arcTo(40.07f, 40.07f, 0.0f, false, false, 16.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.48f, 104.0f);
        pathBuilder.lineTo(166.81f, 104.0f);
        pathBuilder.lineToRelative(41.86f, -33.49f);
        pathBuilder.arcTo(63.73f, 63.73f, 0.0f, false, true, 223.48f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 48.0f);
        pathBuilder.arcToRelative(63.59f, 63.59f, 0.0f, false, true, 36.69f, 11.61f);
        pathBuilder.lineTo(152.0f, 95.35f);
        pathBuilder.lineTo(152.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 176.0f);
        pathBuilder.lineTo(120.0f, 176.0f);
        pathBuilder.arcToRelative(64.09f, 64.09f, 0.0f, false, true, -63.5f, -56.0f);
        pathBuilder.horizontalLineToRelative(167.0f);
        pathBuilder.arcTo(64.09f, 64.09f, 0.0f, false, true, 160.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _babyCarriage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
