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

/* compiled from: Cubetransparent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeTransparent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCubeTransparent", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeTransparent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubetransparentKt {
    private static ImageVector _cubeTransparent;

    public static final ImageVector getCubeTransparent(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _cubeTransparent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CubeTransparent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 96.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.lineTo(40.0f, 160.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(221.66f, 90.34f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(-56.0f, -56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f);
        pathBuilder2.lineTo(40.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.lineTo(32.0f, 160.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.3f, 5.61f);
        pathBuilder2.lineToRelative(56.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 224.0f);
        pathBuilder2.lineTo(216.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(224.0f, 96.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 221.66f, 90.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 59.31f);
        pathBuilder2.lineTo(196.69f, 88.0f);
        pathBuilder2.lineTo(168.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 196.69f);
        pathBuilder2.lineTo(59.31f, 168.0f);
        pathBuilder2.lineTo(88.0f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 152.0f);
        pathBuilder2.lineTo(48.0f, 152.0f);
        pathBuilder2.lineTo(48.0f, 59.31f);
        pathBuilder2.lineToRelative(40.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(59.31f, 48.0f);
        pathBuilder2.lineTo(152.0f, 48.0f);
        pathBuilder2.lineTo(152.0f, 88.0f);
        pathBuilder2.lineTo(99.31f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 104.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.lineTo(104.0f, 152.0f);
        pathBuilder2.lineTo(104.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 208.0f);
        pathBuilder2.lineTo(104.0f, 168.0f);
        pathBuilder2.horizontalLineToRelative(52.69f);
        pathBuilder2.lineToRelative(40.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 196.69f);
        pathBuilder2.lineTo(168.0f, 156.69f);
        pathBuilder2.lineTo(168.0f, 104.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeTransparent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
