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

/* compiled from: Paperplaneright.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPaperPlaneRight", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneRight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanerightKt {
    private static ImageVector _paperPlaneRight;

    public static final ImageVector getPaperPlaneRight(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _paperPlaneRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlaneRight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.89f, 117.43f);
        pathBuilder.lineToRelative(-168.0f, -95.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.7f, 36.0f);
        pathBuilder.lineToRelative(31.08f, 92.0f);
        pathBuilder.lineTo(44.71f, 220.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 236.0f);
        pathBuilder.arcToRelative(12.13f, 12.13f, 0.0f, false, false, 5.93f, -1.57f);
        pathBuilder.lineToRelative(167.94f, -96.08f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.92f);
        pathBuilder.close();
        pathBuilder.moveTo(225.89f, 131.43f);
        pathBuilder.lineTo(58.0f, 227.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, -4.83f);
        pathBuilder.lineToRelative(0.0f, -0.07f);
        pathBuilder.lineTo(82.87f, 132.0f);
        pathBuilder.lineTo(144.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(82.87f, 124.0f);
        pathBuilder.lineTo(52.26f, 33.37f);
        pathBuilder.arcTo(3.89f, 3.89f, 0.0f, false, true, 53.44f, 29.0f);
        pathBuilder.arcTo(4.13f, 4.13f, 0.0f, false, true, 56.0f, 28.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, 1.93f, 0.54f);
        pathBuilder.lineToRelative(168.0f, 95.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
