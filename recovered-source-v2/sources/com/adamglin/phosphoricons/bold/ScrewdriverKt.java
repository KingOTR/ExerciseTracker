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

/* compiled from: Screwdriver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Screwdriver", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getScrewdriver", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_screwdriver", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrewdriverKt {
    private static ImageVector _screwdriver;

    public static final ImageVector getScrewdriver(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _screwdriver;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Screwdriver", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.49f, 47.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineToRelative(-52.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(52.0f, -52.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 208.49f, 47.49f);
        pathBuilder.close();
        pathBuilder.moveTo(252.0f, 58.41f);
        pathBuilder.arcTo(54.09f, 54.09f, 0.0f, false, true, 236.06f, 96.9f);
        pathBuilder.lineToRelative(-53.23f, 53.23f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, true, 168.69f, 156.0f);
        pathBuilder.lineTo(156.0f, 156.0f);
        pathBuilder.verticalLineToRelative(12.83f);
        pathBuilder.arcToRelative(20.13f, 20.13f, 0.0f, false, true, -4.06f, 12.08f);
        pathBuilder.arcToRelative(11.45f, 11.45f, 0.0f, false, true, -1.08f, 1.23f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f);
        pathBuilder.lineTo(98.7f, 174.26f);
        pathBuilder.lineTo(24.49f, 248.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(74.22f, -74.22f);
        pathBuilder.lineTo(65.86f, 141.41f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.29f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcTo(11.56f, 11.56f, 0.0f, false, true, 75.1f, 104.0f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, true, 87.17f, 100.0f);
        pathBuilder.lineTo(100.0f, 100.0f);
        pathBuilder.lineTo(100.0f, 87.3f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, true, 5.86f, -14.15f);
        pathBuilder.lineToRelative(53.23f, -53.23f);
        pathBuilder.arcTo(54.43f, 54.43f, 0.0f, false, true, 252.0f, 58.41f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 58.41f);
        pathBuilder.arcToRelative(30.43f, 30.43f, 0.0f, false, false, -51.94f, -21.52f);
        pathBuilder.lineTo(124.0f, 89.0f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(88.94f, 124.0f);
        pathBuilder.lineToRelative(-3.28f, 3.28f);
        pathBuilder.lineToRelative(21.52f, 21.53f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(21.53f, 21.52f);
        pathBuilder.lineToRelative(3.28f, -3.28f);
        pathBuilder.lineTo(131.99f, 152.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.lineToRelative(52.06f, -52.07f);
        pathBuilder.arcTo(30.24f, 30.24f, 0.0f, false, false, 228.0f, 58.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _screwdriver = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
