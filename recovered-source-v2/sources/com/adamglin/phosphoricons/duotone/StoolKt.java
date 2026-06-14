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

/* compiled from: Stool.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Stool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStool", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stool", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoolKt {
    private static ImageVector _stool;

    public static final ImageVector getStool(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _stool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Stool", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 40.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(200.0f, 64.0f);
        pathBuilder2.verticalLineTo(40.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(6.64f);
        pathBuilder2.lineTo(56.1f, 222.75f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.65f, 9.15f);
        pathBuilder2.arcTo(7.82f, 7.82f, 0.0f, false, false, 64.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.89f, -6.75f);
        pathBuilder2.lineTo(79.68f, 176.0f);
        pathBuilder2.horizontalLineToRelative(96.64f);
        pathBuilder2.lineToRelative(7.78f, 49.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 232.0f);
        pathBuilder2.arcToRelative(7.82f, 7.82f, 0.0f, false, false, 1.26f, -0.1f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.65f, -9.15f);
        pathBuilder2.lineTo(177.36f, 80.0f);
        pathBuilder2.horizontalLineTo(184.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 40.0f);
        pathBuilder2.horizontalLineTo(184.0f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(173.79f, 160.0f);
        pathBuilder2.horizontalLineTo(82.21f);
        pathBuilder2.lineTo(94.84f, 80.0f);
        pathBuilder2.horizontalLineToRelative(66.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
