package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Synagogue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Synagogue", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSynagogue", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_synagogue", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SynagogueKt {
    private static ImageVector _synagogue;

    public static final ImageVector getSynagogue(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _synagogue;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Synagogue", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.0f, 58.84f);
        pathBuilder.lineTo(206.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(194.0f, 58.84f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 178.0f, 80.0f);
        pathBuilder.verticalLineToRelative(45.66f);
        pathBuilder.lineToRelative(-44.0f, -25.14f);
        pathBuilder.lineTo(134.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(28.52f);
        pathBuilder.lineTo(78.0f, 125.66f);
        pathBuilder.lineTo(78.0f, 80.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 62.0f, 58.84f);
        pathBuilder.lineTo(62.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(50.0f, 58.84f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 34.0f, 80.0f);
        pathBuilder.lineTo(34.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(118.0f, 176.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(222.0f, 80.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 206.0f, 58.84f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 70.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(190.0f, 106.0f);
        pathBuilder.lineTo(190.0f, 80.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 70.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 66.0f, 80.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(46.0f, 106.0f);
        pathBuilder.lineTo(46.0f, 80.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 56.0f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 118.0f);
        pathBuilder.lineTo(66.0f, 118.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.lineTo(46.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 154.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.lineTo(78.0f, 210.0f);
        pathBuilder.lineTo(78.0f, 139.48f);
        pathBuilder.lineToRelative(50.0f, -28.57f);
        pathBuilder.lineToRelative(50.0f, 28.57f);
        pathBuilder.lineTo(178.0f, 210.0f);
        pathBuilder.lineTo(150.0f, 210.0f);
        pathBuilder.lineTo(150.0f, 176.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 128.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 210.0f);
        pathBuilder.lineTo(190.0f, 118.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _synagogue = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
