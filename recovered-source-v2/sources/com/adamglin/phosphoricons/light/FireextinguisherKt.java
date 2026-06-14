package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fireextinguisher.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FireExtinguisher", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFireExtinguisher", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fireExtinguisher", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireextinguisherKt {
    private static ImageVector _fireExtinguisher;

    public static final ImageVector getFireExtinguisher(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _fireExtinguisher;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FireExtinguisher", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(217.72f, 50.25f);
        pathBuilder.lineTo(152.21f, 30.6f);
        pathBuilder.lineToRelative(34.47f, -17.23f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f);
        pathBuilder.lineTo(134.51f, 26.0f);
        pathBuilder.arcTo(78.07f, 78.07f, 0.0f, false, false, 58.0f, 104.0f);
        pathBuilder.lineTo(58.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(70.0f, 174.0f);
        pathBuilder.lineTo(90.0f, 174.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(182.0f, 104.0f);
        pathBuilder.arcToRelative(46.07f, 46.07f, 0.0f, false, false, -40.0f, -45.6f);
        pathBuilder.lineTo(142.0f, 40.07f);
        pathBuilder.lineToRelative(72.27f, 21.68f);
        pathBuilder.arcTo(6.14f, 6.14f, 0.0f, false, false, 216.0f, 62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.72f, -11.75f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 162.0f);
        pathBuilder.lineTo(70.0f, 104.0f);
        pathBuilder.arcToRelative(66.07f, 66.07f, 0.0f, false, true, 60.0f, -65.71f);
        pathBuilder.lineTo(130.0f, 58.4f);
        pathBuilder.arcTo(46.07f, 46.07f, 0.0f, false, false, 90.0f, 104.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 234.0f);
        pathBuilder.lineTo(104.0f, 234.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(102.0f, 174.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 168.0f, 234.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 104.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.lineTo(102.0f, 162.0f);
        pathBuilder.lineTo(102.0f, 104.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fireExtinguisher = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
