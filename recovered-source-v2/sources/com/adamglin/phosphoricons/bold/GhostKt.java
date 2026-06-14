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

/* compiled from: Ghost.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ghost", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGhost", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ghost", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GhostKt {
    private static ImageVector _ghost;

    public static final ImageVector getGhost(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _ghost;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ghost", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 116.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 116.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 100.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 156.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 120.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.6f, 9.29f);
        pathBuilder.lineTo(186.67f, 207.5f);
        pathBuilder.lineToRelative(-21.74f, 17.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.2f, 0.0f);
        pathBuilder.lineTo(128.0f, 207.5f);
        pathBuilder.lineToRelative(-21.73f, 17.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.2f, 0.0f);
        pathBuilder.lineTo(69.33f, 207.5f);
        pathBuilder.lineTo(47.6f, 225.29f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 216.0f);
        pathBuilder.lineTo(28.0f, 120.0f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, true, 200.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 120.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f);
        pathBuilder.verticalLineToRelative(70.68f);
        pathBuilder.lineToRelative(9.73f, -8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f);
        pathBuilder.lineTo(98.67f, 200.5f);
        pathBuilder.lineToRelative(21.73f, -17.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f);
        pathBuilder.lineToRelative(21.73f, 17.79f);
        pathBuilder.lineToRelative(21.74f, -17.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f);
        pathBuilder.lineToRelative(9.73f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ghost = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
