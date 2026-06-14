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

/* compiled from: Command.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Command", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCommand", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_command", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommandKt {
    private static ImageVector _command;

    public static final ImageVector getCommand(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _command;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Command", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 116.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(116.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 72.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(100.0f, 86.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 86.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 86.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 170.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 28.0f, 0.0f);
        pathBuilder.lineTo(100.0f, 156.0f);
        pathBuilder.lineTo(86.0f, 156.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 170.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 140.0f);
        pathBuilder.lineTo(156.0f, 116.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.lineTo(116.0f, 100.0f);
        pathBuilder.lineTo(116.0f, 86.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(86.0f, 140.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f);
        pathBuilder.lineTo(116.0f, 156.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, -30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 170.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, -14.0f);
        pathBuilder.lineTo(156.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _command = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
