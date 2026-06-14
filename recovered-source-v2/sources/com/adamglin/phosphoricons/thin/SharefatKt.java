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

/* compiled from: Sharefat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShareFat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShareFat", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shareFat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharefatKt {
    private static ImageVector _shareFat;

    public static final ImageVector getShareFat(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _shareFat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShareFat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.83f, 109.17f);
        pathBuilder.lineToRelative(-80.0f, -80.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 32.0f);
        pathBuilder.verticalLineTo(76.09f);
        pathBuilder.curveToRelative(-54.0f, 2.44f, -120.43f, 53.55f, -127.94f, 119.0f);
        pathBuilder.arcToRelative(7.87f, 7.87f, 0.0f, false, false, 4.58f, 8.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.41f, 0.77f);
        pathBuilder.arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.79f, -2.55f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(11.53f, -12.27f, 53.29f, -51.73f, 114.16f, -53.4f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.83f, 2.83f);
        pathBuilder.lineToRelative(80.0f, -80.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 109.17f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 182.33f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.curveToRelative(-27.39f, 0.0f, -54.08f, 7.17f, -79.34f, 21.3f);
        pathBuilder.arcTo(189.91f, 189.91f, 0.0f, false, false, 28.0f, 196.0f);
        pathBuilder.lineToRelative(2.92f, 2.74f);
        pathBuilder.lineTo(28.0f, 196.0f);
        pathBuilder.curveToRelative(3.36f, -29.21f, 19.55f, -57.48f, 45.6f, -79.57f);
        pathBuilder.curveTo(97.53f, 96.11f, 126.83f, 84.0f, 152.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(41.66f);
        pathBuilder.lineTo(226.34f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shareFat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
