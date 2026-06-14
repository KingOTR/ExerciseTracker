package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dog", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDog", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dog", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DogKt {
    private static ImageVector _dog;

    public static final ImageVector getDog(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _dog;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dog", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 120.38f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder.verticalLineTo(120.38f);
        pathBuilder.lineTo(104.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.71f, 125.0f);
        pathBuilder2.lineToRelative(-16.42f, -88.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.61f, -12.58f);
        pathBuilder2.lineToRelative(-0.31f, 0.09f);
        pathBuilder2.lineTo(150.85f, 40.0f);
        pathBuilder2.horizontalLineToRelative(-45.7f);
        pathBuilder2.lineTo(52.63f, 24.56f);
        pathBuilder2.lineToRelative(-0.31f, -0.09f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.71f, 37.05f);
        pathBuilder2.lineTo(16.29f, 125.0f);
        pathBuilder2.arcToRelative(15.77f, 15.77f, 0.0f, false, false, 9.12f, 17.52f);
        pathBuilder2.arcTo(16.26f, 16.26f, 0.0f, false, false, 32.12f, 144.0f);
        pathBuilder2.arcTo(15.48f, 15.48f, 0.0f, false, false, 40.0f, 141.84f);
        pathBuilder2.lineTo(40.0f, 184.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f);
        pathBuilder2.lineTo(216.0f, 141.85f);
        pathBuilder2.arcToRelative(15.5f, 15.5f, 0.0f, false, false, 7.87f, 2.16f);
        pathBuilder2.arcToRelative(16.31f, 16.31f, 0.0f, false, false, 6.72f, -1.47f);
        pathBuilder2.arcTo(15.77f, 15.77f, 0.0f, false, false, 239.71f, 125.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 128.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineTo(48.43f, 40.0f);
        pathBuilder2.lineTo(90.5f, 52.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 208.0f);
        pathBuilder2.lineTo(136.0f, 208.0f);
        pathBuilder2.lineTo(136.0f, 195.31f);
        pathBuilder2.lineToRelative(13.66f, -13.65f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder2.lineTo(128.0f, 180.69f);
        pathBuilder2.lineToRelative(-10.34f, -10.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder2.lineTo(120.0f, 195.31f);
        pathBuilder2.lineTo(120.0f, 208.0f);
        pathBuilder2.lineTo(80.0f, 208.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder2.lineTo(56.0f, 123.11f);
        pathBuilder2.lineTo(107.93f, 56.0f);
        pathBuilder2.horizontalLineToRelative(40.14f);
        pathBuilder2.lineTo(200.0f, 123.11f);
        pathBuilder2.lineTo(200.0f, 184.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 128.0f);
        pathBuilder2.lineTo(165.5f, 52.37f);
        pathBuilder2.lineTo(207.57f, 40.0f);
        pathBuilder2.lineTo(224.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dog = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
