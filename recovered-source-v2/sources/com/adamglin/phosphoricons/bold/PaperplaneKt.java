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

/* compiled from: Paperplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPaperPlane", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplaneKt {
    private static ImageVector _paperPlane;

    public static final ImageVector getPaperPlane(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _paperPlane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.42f, 198.2f);
        pathBuilder.lineToRelative(-0.06f, -0.09f);
        pathBuilder.lineTo(145.3f, 30.17f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.82f, 0.0f);
        pathBuilder.lineTo(14.58f, 198.2f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.06f, 28.65f);
        pathBuilder.lineTo(128.0f, 196.67f);
        pathBuilder.lineToRelative(89.36f, 30.18f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 6.69f, 1.15f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.37f, -29.8f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 175.39f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(55.39f);
        pathBuilder.lineTo(40.72f, 200.82f);
        pathBuilder.lineTo(127.89f, 48.06f);
        pathBuilder.lineToRelative(87.37f, 152.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
