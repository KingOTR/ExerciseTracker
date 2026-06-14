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

/* compiled from: Crown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCrown", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownKt {
    private static ImageVector _crown;

    public static final ImageVector getCrown(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _crown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Crown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.0f, 80.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -60.0f, 15.45f);
        pathBuilder.lineToRelative(-20.86f, 25.66f);
        pathBuilder.lineTo(150.82f, 74.4f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.64f, 0.0f);
        pathBuilder.lineTo(84.87f, 121.11f);
        pathBuilder.lineTo(64.0f, 95.45f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -35.0f, 15.78f);
        pathBuilder.lineToRelative(14.0f, 84.06f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 62.78f, 212.0f);
        pathBuilder.lineTo(193.22f, 212.0f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 213.0f, 195.29f);
        pathBuilder.lineToRelative(14.0f, -84.06f);
        pathBuilder.arcTo(32.05f, 32.05f, 0.0f, false, false, 252.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 220.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 36.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.83f, 188.0f);
        pathBuilder.lineTo(66.17f, 188.0f);
        pathBuilder.lineTo(55.29f, 122.78f);
        pathBuilder.lineToRelative(23.4f, 28.79f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 156.0f);
        pathBuilder.arcToRelative(12.87f, 12.87f, 0.0f, false, false, 1.63f, -0.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, -7.1f);
        pathBuilder.lineTo(127.18f, 84.0f);
        pathBuilder.lineToRelative(0.82f, 0.0f);
        pathBuilder.lineToRelative(0.82f, 0.0f);
        pathBuilder.lineTo(157.0f, 148.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, 7.1f);
        pathBuilder.arcTo(12.87f, 12.87f, 0.0f, false, false, 168.0f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.31f, -4.43f);
        pathBuilder.lineToRelative(23.4f, -28.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
