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

/* compiled from: Celltower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCellTower", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cellTower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CelltowerKt {
    private static ImageVector _cellTower;

    public static final ImageVector getCellTower(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CellTower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(138.67f, 86.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.34f, 0.0f);
        pathBuilder.lineToRelative(-72.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.34f, 11.0f);
        pathBuilder.lineToRelative(11.0f, -21.49f);
        pathBuilder.lineTo(178.28f, 216.02f);
        pathBuilder.lineToRelative(11.05f, 21.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.34f, -11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 118.24f);
        pathBuilder.lineTo(145.36f, 152.0f);
        pathBuilder.lineTo(110.64f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.07f, 192.0f);
        pathBuilder.lineToRelative(8.22f, -16.0f);
        pathBuilder.horizontalLineToRelative(59.42f);
        pathBuilder.lineToRelative(8.22f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.51f, 68.73f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.45f, 10.75f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -50.37f, 0.52f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 81.0f, 69.7f);
        pathBuilder.arcTo(52.28f, 52.28f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.arcTo(51.74f, 51.74f, 0.0f, false, true, 174.51f, 68.73f);
        pathBuilder.close();
        pathBuilder.moveTo(49.93f, 144.73f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, 156.14f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 185.71f, 132.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, -115.42f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 49.93f, 144.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cellTower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
