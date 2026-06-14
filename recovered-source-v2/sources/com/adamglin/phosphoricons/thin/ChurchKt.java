package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Church.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Church", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChurch", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_church", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _church;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Church", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.06f, 148.57f);
        pathBuilder.lineTo(188.0f, 125.74f);
        pathBuilder.lineTo(188.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.47f);
        pathBuilder.lineTo(132.0f, 69.68f);
        pathBuilder.lineTo(132.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(132.0f, 36.0f);
        pathBuilder.lineTo(132.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 36.0f);
        pathBuilder.lineTo(104.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(124.0f, 69.68f);
        pathBuilder.lineTo(70.0f, 100.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 104.0f);
        pathBuilder.verticalLineToRelative(21.74f);
        pathBuilder.lineTo(29.94f, 148.57f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 152.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(116.0f, 168.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(228.0f, 152.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 226.06f, 148.57f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 154.26f);
        pathBuilder.lineToRelative(32.0f, -19.2f);
        pathBuilder.lineTo(68.0f, 212.0f);
        pathBuilder.lineTo(36.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.lineTo(76.0f, 212.0f);
        pathBuilder.lineTo(76.0f, 106.32f);
        pathBuilder.lineToRelative(52.0f, -29.71f);
        pathBuilder.lineToRelative(52.0f, 29.71f);
        pathBuilder.lineTo(180.0f, 212.0f);
        pathBuilder.lineTo(148.0f, 212.0f);
        pathBuilder.lineTo(148.0f, 168.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 212.0f);
        pathBuilder.lineTo(188.0f, 212.0f);
        pathBuilder.lineTo(188.0f, 135.06f);
        pathBuilder.lineToRelative(32.0f, 19.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _church = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
