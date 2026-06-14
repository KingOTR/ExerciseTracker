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

/* compiled from: Fourk.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FourK", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFourK", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fourK", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FourkKt {
    private static ImageVector _fourK;

    public static final ImageVector getFourK(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _fourK;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FourK", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(24.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.lineTo(224.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(32.0f, 56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 200.0f);
        pathBuilder2.lineTo(32.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(224.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(152.0f, 147.0f);
        pathBuilder2.lineToRelative(13.09f, -15.0f);
        pathBuilder2.lineToRelative(28.0f, 48.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 206.91f, 172.0f);
        pathBuilder2.lineToRelative(-30.7f, -52.63f);
        pathBuilder2.lineTo(206.0f, 85.27f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, -10.54f);
        pathBuilder2.lineToRelative(-42.0f, 48.0f);
        pathBuilder2.lineTo(152.0f, 80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 176.0f);
        pathBuilder2.lineTo(88.0f, 160.0f);
        pathBuilder2.lineTo(40.0f, 160.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.31f, -12.91f);
        pathBuilder2.lineToRelative(56.0f, -72.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 144.0f);
        pathBuilder2.lineTo(88.0f, 103.32f);
        pathBuilder2.lineTo(56.36f, 144.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fourK = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
