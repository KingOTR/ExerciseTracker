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

/* compiled from: Usergear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUserGear", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsergearKt {
    private static ImageVector _userGear;

    public static final ImageVector getUserGear(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _userGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(148.5f, 156.53f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, false, -48.69f, 35.75f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f);
        pathBuilder.curveTo(48.54f, 184.69f, 75.11f, 172.0f, 104.0f, 172.0f);
        pathBuilder.curveToRelative(37.0f, 0.0f, 61.12f, 19.42f, 74.81f, 35.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f);
        pathBuilder.arcTo(124.0f, 124.0f, 0.0f, false, false, 148.5f, 156.53f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 100.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 56.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.53f, 140.0f);
        pathBuilder.lineTo(239.42f, 142.31f);
        pathBuilder.lineTo(243.81f, 148.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, 14.11f);
        pathBuilder.lineToRelative(-4.4f, -6.06f);
        pathBuilder.lineToRelative(-4.4f, 6.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, -14.11f);
        pathBuilder.lineToRelative(4.39f, -6.05f);
        pathBuilder.lineTo(193.47f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, -22.83f);
        pathBuilder.lineToRelative(7.12f, 2.31f);
        pathBuilder.lineTo(208.0f, 112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(7.48f);
        pathBuilder.lineToRelative(7.12f, -2.31f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 246.53f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
