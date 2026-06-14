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

/* compiled from: Lectern.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lectern", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLectern", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lectern", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LecternKt {
    private static ImageVector _lectern;

    public static final ImageVector getLectern(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lectern;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lectern", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.51f, 121.74f);
        pathBuilder.lineToRelative(-40.0f, -80.0f);
        pathBuilder.arcTo(13.92f, 13.92f, 0.0f, false, false, 192.0f, 34.0f);
        pathBuilder.lineTo(64.0f, 34.0f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, -12.52f, 7.74f);
        pathBuilder.lineToRelative(-40.0f, 80.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 24.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(98.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(96.0f, 210.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 210.0f);
        pathBuilder.lineTo(134.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(98.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.52f, -20.26f);
        pathBuilder.close();
        pathBuilder.moveTo(233.69f, 129.05f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.7f, 0.95f);
        pathBuilder.lineTo(24.0f, 130.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.79f, -2.89f);
        pathBuilder.lineToRelative(40.0f, -80.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 64.0f, 46.0f);
        pathBuilder.lineTo(192.0f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.79f, 1.11f);
        pathBuilder.lineToRelative(40.0f, 80.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 233.69f, 129.05f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(72.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(184.0f, 98.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 190.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lectern = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
