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

/* compiled from: Building.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Building", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBuilding", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_building", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuildingKt {
    private static ImageVector _building;

    public static final ImageVector getBuilding(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _building;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Building", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 226.0f);
        pathBuilder.lineTo(206.0f, 226.0f);
        pathBuilder.lineTo(206.0f, 30.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(40.0f, 18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(50.0f, 30.0f);
        pathBuilder.lineTo(50.0f, 226.0f);
        pathBuilder.lineTo(24.0f, 226.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(232.0f, 238.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 30.0f);
        pathBuilder.lineTo(194.0f, 30.0f);
        pathBuilder.lineTo(194.0f, 226.0f);
        pathBuilder.lineTo(158.0f, 226.0f);
        pathBuilder.lineTo(158.0f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(104.0f, 178.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(42.0f);
        pathBuilder.lineTo(62.0f, 226.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 226.0f);
        pathBuilder.lineTo(110.0f, 226.0f);
        pathBuilder.lineTo(110.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(96.0f, 70.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(144.0f, 70.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(96.0f, 110.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(144.0f, 110.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(144.0f, 150.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _building = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
