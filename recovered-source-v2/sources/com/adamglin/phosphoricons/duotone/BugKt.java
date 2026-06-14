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

/* compiled from: Bug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBug", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BugKt {
    private static ImageVector _bug;

    public static final ImageVector getBug(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bug;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bug", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(144.0f, 92.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 92.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(100.0f, 80.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 144.0f);
        pathBuilder2.arcTo(87.76f, 87.76f, 0.0f, false, true, 213.0f, 167.0f);
        pathBuilder2.lineToRelative(22.24f, 9.72f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 192.0f);
        pathBuilder2.arcToRelative(7.89f, 7.89f, 0.0f, false, true, -3.2f, -0.67f);
        pathBuilder2.lineTo(207.38f, 182.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -158.76f, 0.0f);
        pathBuilder2.lineTo(27.2f, 191.33f);
        pathBuilder2.arcTo(7.89f, 7.89f, 0.0f, false, true, 24.0f, 192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.2f, -15.33f);
        pathBuilder2.lineTo(43.0f, 167.0f);
        pathBuilder2.arcTo(87.76f, 87.76f, 0.0f, false, true, 40.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineTo(16.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.lineTo(40.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(87.76f, 87.76f, 0.0f, false, true, 3.0f, -23.0f);
        pathBuilder2.lineTo(20.8f, 79.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.4f, -14.66f);
        pathBuilder2.lineTo(48.62f, 74.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 158.76f, 0.0f);
        pathBuilder2.lineToRelative(21.42f, -9.36f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.4f, 14.66f);
        pathBuilder2.lineTo(213.0f, 89.05f);
        pathBuilder2.arcToRelative(87.76f, 87.76f, 0.0f, false, true, 3.0f, 23.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(216.0f, 136.05f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 120.0f);
        pathBuilder2.lineTo(200.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 215.54f);
        pathBuilder2.lineTo(120.0f, 136.0f);
        pathBuilder2.lineTo(56.0f, 136.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, false, 120.0f, 215.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineTo(136.0f, 136.0f);
        pathBuilder2.verticalLineToRelative(79.54f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, false, 200.0f, 144.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
