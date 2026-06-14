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

/* compiled from: Maptrifold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapTrifold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMapTrifold", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapTrifold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaptrifoldKt {
    private static ImageVector _mapTrifold;

    public static final ImageVector getMapTrifold(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _mapTrifold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapTrifold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.46f, 52.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.43f, -0.73f);
        pathBuilder.lineTo(160.47f, 67.76f);
        pathBuilder.lineTo(97.79f, 36.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, -0.3f);
        pathBuilder.lineToRelative(-64.0f, 16.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 3.88f);
        pathBuilder.lineToRelative(62.56f, -15.64f);
        pathBuilder.lineToRelative(62.68f, 31.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.76f, 0.3f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -3.88f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 226.46f, 52.85f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 46.47f);
        pathBuilder.lineToRelative(56.0f, 28.0f);
        pathBuilder.verticalLineTo(209.53f);
        pathBuilder.lineToRelative(-56.0f, -28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 59.12f);
        pathBuilder.lineToRelative(56.0f, -14.0f);
        pathBuilder.verticalLineTo(180.88f);
        pathBuilder.lineToRelative(-56.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 196.88f);
        pathBuilder.lineToRelative(-56.0f, 14.0f);
        pathBuilder.verticalLineTo(75.12f);
        pathBuilder.lineToRelative(56.0f, -14.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapTrifold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
