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

/* compiled from: Backspace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Backspace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBackspace", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_backspace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackspaceKt {
    private static ImageVector _backspace;

    public static final ImageVector getBackspace(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Backspace", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(68.53f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.86f, -3.88f);
        pathBuilder.lineTo(16.0f, 128.0f);
        pathBuilder.lineTo(61.67f, 51.88f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 68.53f, 48.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 40.0f);
        pathBuilder2.horizontalLineTo(68.53f);
        pathBuilder2.arcToRelative(16.08f, 16.08f, 0.0f, false, false, -13.72f, 7.77f);
        pathBuilder2.lineTo(9.14f, 123.88f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.24f);
        pathBuilder2.lineToRelative(45.67f, 76.11f);
        pathBuilder2.arcTo(16.08f, 16.08f, 0.0f, false, false, 68.53f, 216.0f);
        pathBuilder2.horizontalLineTo(216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.verticalLineTo(56.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(61.67f, 204.12f);
        pathBuilder2.lineTo(68.53f, 200.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 200.0f);
        pathBuilder2.horizontalLineTo(68.53f);
        pathBuilder2.lineToRelative(-43.2f, -72.0f);
        pathBuilder2.lineToRelative(43.2f, -72.0f);
        pathBuilder2.horizontalLineTo(216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(106.34f, 146.34f);
        pathBuilder2.lineTo(124.69f, 128.0f);
        pathBuilder2.lineToRelative(-18.35f, -18.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(136.0f, 116.69f);
        pathBuilder2.lineToRelative(18.34f, -18.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineTo(147.31f, 128.0f);
        pathBuilder2.lineToRelative(18.35f, 18.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.lineTo(136.0f, 139.31f);
        pathBuilder2.lineToRelative(-18.34f, 18.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _backspace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
