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

/* compiled from: Eyeclosed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEyeClosed", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeClosed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeclosedKt {
    private static ImageVector _eyeClosed;

    public static final ImageVector getEyeClosed(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _eyeClosed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeClosed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.94f, 164.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 217.05f, 172.0f);
        pathBuilder.lineToRelative(-19.0f, -33.2f);
        pathBuilder.arcTo(123.23f, 123.23f, 0.0f, false, true, 162.0f, 155.46f);
        pathBuilder.lineToRelative(5.87f, 35.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, 9.21f);
        pathBuilder.arcTo(8.4f, 8.4f, 0.0f, false, true, 160.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.69f);
        pathBuilder.lineToRelative(-5.77f, -34.58f);
        pathBuilder.arcToRelative(133.06f, 133.06f, 0.0f, false, true, -36.68f, 0.0f);
        pathBuilder.lineToRelative(-5.77f, 34.58f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 200.0f);
        pathBuilder.arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.32f, -0.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -9.21f);
        pathBuilder.lineTo(94.0f, 155.46f);
        pathBuilder.arcToRelative(123.23f, 123.23f, 0.0f, false, true, -36.06f, -16.69f);
        pathBuilder.lineTo(39.0f, 172.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 25.06f, 164.0f);
        pathBuilder.lineToRelative(20.0f, -35.0f);
        pathBuilder.arcToRelative(152.8f, 152.8f, 0.0f, false, true, -19.3f, -20.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -10.06f);
        pathBuilder.curveTo(44.56f, 75.72f, 77.55f, 48.0f, 128.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(83.44f, 27.72f, 102.22f, 51.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 10.06f);
        pathBuilder.arcToRelative(152.8f, 152.8f, 0.0f, false, true, -19.3f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeClosed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
