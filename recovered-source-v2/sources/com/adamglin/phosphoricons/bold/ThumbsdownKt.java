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

/* compiled from: Thumbsdown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThumbsDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getThumbsDown", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thumbsDown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThumbsdownKt {
    private static ImageVector _thumbsDown;

    public static final ImageVector getThumbsDown(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _thumbsDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThumbsDown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.78f, 156.53f);
        pathBuilder.lineToRelative(-12.0f, -96.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 204.0f, 36.0f);
        pathBuilder.lineTo(32.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 56.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(72.58f, 164.0f);
        pathBuilder.lineToRelative(36.69f, 73.37f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 244.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f);
        pathBuilder.lineTo(164.0f, 188.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.78f, -31.47f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 140.0f);
        pathBuilder.lineTo(36.0f, 140.0f);
        pathBuilder.lineTo(36.0f, 60.0f);
        pathBuilder.lineTo(68.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.0f, 162.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.35f);
        pathBuilder.lineTo(152.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -13.18f, 18.8f);
        pathBuilder.lineTo(92.0f, 149.17f);
        pathBuilder.lineTo(92.0f, 60.0f);
        pathBuilder.lineTo(204.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.5f);
        pathBuilder.lineToRelative(12.0f, 96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 219.0f, 162.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thumbsDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
