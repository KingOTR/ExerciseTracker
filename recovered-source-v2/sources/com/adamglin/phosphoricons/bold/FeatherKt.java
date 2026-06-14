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

/* compiled from: Feather.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Feather", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFeather", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_feather", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatherKt {
    private static ImageVector _feather;

    public static final ImageVector getFeather(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _feather;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Feather", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.11f, 31.92f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 128.0f, 31.87f);
        pathBuilder.lineToRelative(-70.12f, 69.3f);
        pathBuilder.arcTo(19.91f, 19.91f, 0.0f, false, false, 52.0f, 115.31f);
        pathBuilder.lineTo(52.0f, 187.0f);
        pathBuilder.lineTo(23.52f, 215.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineTo(69.0f, 204.0f);
        pathBuilder.lineTo(140.7f, 204.0f);
        pathBuilder.arcToRelative(19.87f, 19.87f, 0.0f, false, false, 14.15f, -5.86f);
        pathBuilder.lineToRelative(0.05f, 0.0f);
        pathBuilder.lineToRelative(69.21f, -70.0f);
        pathBuilder.arcTo(68.06f, 68.06f, 0.0f, false, false, 224.11f, 31.92f);
        pathBuilder.close();
        pathBuilder.moveTo(144.9f, 48.92f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 210.0f, 108.0f);
        pathBuilder.lineTo(165.0f, 108.0f);
        pathBuilder.lineToRelative(27.52f, -27.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineTo(124.0f, 115.0f);
        pathBuilder.lineTo(124.0f, 69.54f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 117.0f);
        pathBuilder.lineToRelative(24.0f, -23.72f);
        pathBuilder.lineTo(100.0f, 139.0f);
        pathBuilder.lineTo(76.0f, 163.0f);
        pathBuilder.close();
        pathBuilder.moveTo(139.0f, 180.0f);
        pathBuilder.lineTo(93.0f, 180.0f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.horizontalLineToRelative(45.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _feather = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
