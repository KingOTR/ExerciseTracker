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

/* compiled from: Notmemberof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NotMemberOf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNotMemberOf", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_notMemberOf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotmemberofKt {
    private static ImageVector _notMemberOf;

    public static final ImageVector getNotMemberOf(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _notMemberOf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NotMemberOf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 69.27f);
        pathBuilder.lineTo(145.63f, 120.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(131.63f);
        pathBuilder.lineToRelative(-28.76f, 32.87f);
        pathBuilder.arcTo(47.72f, 47.72f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcToRelative(63.62f, 63.62f, 0.0f, false, true, -35.78f, -11.0f);
        pathBuilder.lineTo(78.0f, 197.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.54f);
        pathBuilder.lineToRelative(14.21f, -16.24f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 128.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(45.37f);
        pathBuilder.lineTo(178.0f, 58.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.54f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(31.37f);
        pathBuilder.lineToRelative(-35.0f, 40.0f);
        pathBuilder.horizontalLineTo(80.68f);
        pathBuilder.arcTo(48.07f, 48.07f, 0.0f, false, true, 128.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.68f, 136.0f);
        pathBuilder.horizontalLineToRelative(29.69f);
        pathBuilder.lineTo(90.84f, 158.32f);
        pathBuilder.arcTo(47.78f, 47.78f, 0.0f, false, true, 80.68f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _notMemberOf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
