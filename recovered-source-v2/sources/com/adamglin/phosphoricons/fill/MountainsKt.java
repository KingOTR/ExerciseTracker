package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mountains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mountains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMountains", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mountains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MountainsKt {
    private static ImageVector _mountains;

    public static final ImageVector getMountains(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _mountains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mountains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(254.88f, 195.92f);
        pathBuilder.lineToRelative(-54.56f, -92.08f);
        pathBuilder.arcTo(15.87f, 15.87f, 0.0f, false, false, 186.55f, 96.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(15.85f, 15.85f, 0.0f, false, false, -13.76f, 7.84f);
        pathBuilder.lineToRelative(-15.64f, 26.39f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.07f);
        pathBuilder.lineToRelative(26.8f, 45.47f);
        pathBuilder.arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.89f, 10.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.8f, -2.26f);
        pathBuilder.lineTo(101.79f, 71.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.58f, 0.0f);
        pathBuilder.lineTo(1.11f, 195.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, 9.52f);
        pathBuilder.arcTo(8.23f, 8.23f, 0.0f, false, false, 8.23f, 208.0f);
        pathBuilder.horizontalLineTo(247.77f);
        pathBuilder.arcToRelative(8.29f, 8.29f, 0.0f, false, false, 6.09f, -2.55f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 254.88f, 195.92f);
        pathBuilder.close();
        pathBuilder.moveTo(64.43f, 120.0f);
        pathBuilder.lineTo(88.0f, 80.0f);
        pathBuilder.lineToRelative(23.57f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 52.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 140.0f, 52.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mountains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
