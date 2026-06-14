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

/* compiled from: Hammer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hammer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHammer", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hammer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HammerKt {
    private static ImageVector _hammer;

    public static final ImageVector getHammer(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hammer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hammer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(250.18f, 105.17f);
        pathBuilder.lineTo(186.71f, 41.25f);
        pathBuilder.arcToRelative(100.11f, 100.11f, 0.0f, false, false, -141.43f, 0.0f);
        pathBuilder.lineToRelative(-0.13f, 0.14f);
        pathBuilder.lineTo(31.37f, 55.61f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.24f, 16.7f);
        pathBuilder.lineTo(62.32f, 58.16f);
        pathBuilder.arcTo(75.68f, 75.68f, 0.0f, false, true, 77.49f, 46.43f);
        pathBuilder.lineTo(119.0f, 88.0f);
        pathBuilder.lineTo(25.85f, 181.16f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f);
        pathBuilder.lineToRelative(20.69f, 20.69f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineTo(168.0f, 137.0f);
        pathBuilder.lineToRelative(1.51f, 1.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(23.65f, 23.66f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.lineToRelative(28.69f, -28.7f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 250.18f, 105.17f);
        pathBuilder.close();
        pathBuilder.moveTo(60.68f, 210.34f);
        pathBuilder.lineToRelative(-15.0f, -15.0f);
        pathBuilder.lineTo(108.0f, 133.0f);
        pathBuilder.lineToRelative(15.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 131.0f);
        pathBuilder.lineToRelative(-15.0f, -15.0f);
        pathBuilder.lineToRelative(19.51f, -19.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineTo(102.24f, 37.24f);
        pathBuilder.arcToRelative(75.94f, 75.94f, 0.0f, false, true, 67.47f, 20.95f);
        pathBuilder.lineToRelative(31.44f, 31.67f);
        pathBuilder.lineTo(178.0f, 113.0f);
        pathBuilder.lineToRelative(-1.51f, -1.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.32f, 142.31f);
        pathBuilder.lineTo(195.0f, 130.0f);
        pathBuilder.lineToRelative(23.09f, -23.09f);
        pathBuilder.lineToRelative(12.3f, 12.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hammer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
