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

/* compiled from: Medalmilitary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MedalMilitary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMedalMilitary", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medalMilitary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalmilitaryKt {
    private static ImageVector _medalMilitary;

    public static final ImageVector getMedalMilitary(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _medalMilitary;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MedalMilitary", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 192.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.0f, 48.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.verticalLineToRelative(85.82f);
        pathBuilder.lineToRelative(42.72f, -19.42f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 5.28f, -8.2f);
        pathBuilder.verticalLineTo(57.0f);
        pathBuilder.arcTo(9.0f, 9.0f, 0.0f, false, false, 207.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 48.0f);
        pathBuilder.horizontalLineTo(49.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f);
        pathBuilder.verticalLineToRelative(49.2f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 5.28f, 8.2f);
        pathBuilder.lineTo(88.0f, 133.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(207.0f, 40.0f);
        pathBuilder2.lineTo(49.0f, 40.0f);
        pathBuilder2.arcTo(17.0f, 17.0f, 0.0f, false, false, 32.0f, 57.0f);
        pathBuilder2.verticalLineToRelative(49.21f);
        pathBuilder2.arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, 15.47f);
        pathBuilder2.lineToRelative(62.6f, 28.45f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 46.88f, 0.0f);
        pathBuilder2.lineTo(214.0f, 121.68f);
        pathBuilder2.arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, -15.47f);
        pathBuilder2.lineTo(224.0f, 57.0f);
        pathBuilder2.arcTo(17.0f, 17.0f, 0.0f, false, false, 207.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 56.0f);
        pathBuilder2.verticalLineToRelative(72.67f);
        pathBuilder2.lineToRelative(-32.0f, 14.54f);
        pathBuilder2.lineTo(96.0f, 128.67f);
        pathBuilder2.lineTo(96.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 106.21f);
        pathBuilder2.lineTo(48.0f, 57.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f);
        pathBuilder2.lineTo(80.0f, 56.0f);
        pathBuilder2.verticalLineToRelative(65.39f);
        pathBuilder2.lineTo(48.59f, 107.12f);
        pathBuilder2.arcTo(1.0f, 1.0f, 0.0f, false, true, 48.0f, 106.21f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 224.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 106.21f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.59f, 0.91f);
        pathBuilder2.lineTo(176.0f, 121.39f);
        pathBuilder2.lineTo(176.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(31.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medalMilitary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
