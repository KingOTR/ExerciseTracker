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

/* compiled from: Codepenlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodepenLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCodepenLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codepenLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodepenlogoKt {
    private static ImageVector _codepenLogo;

    public static final ImageVector getCodepenLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _codepenLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CodepenLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.85f, 90.72f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-104.0f, -56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.68f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.15f, 5.28f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(104.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f);
        pathBuilder.lineToRelative(104.0f, -56.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 238.0f, 160.0f);
        pathBuilder.lineTo(238.0f, 96.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 234.85f, 90.72f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 150.0f);
        pathBuilder.lineTo(185.23f, 128.0f);
        pathBuilder.lineToRelative(40.77f, -22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.57f, 121.23f);
        pathBuilder.lineTo(134.0f, 100.42f);
        pathBuilder.lineTo(134.0f, 50.0f);
        pathBuilder.lineToRelative(85.34f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 145.23f);
        pathBuilder.lineTo(96.08f, 128.0f);
        pathBuilder.lineTo(128.0f, 110.81f);
        pathBuilder.lineTo(159.92f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 50.0f);
        pathBuilder.verticalLineToRelative(50.38f);
        pathBuilder.lineTo(83.43f, 121.18f);
        pathBuilder.lineTo(36.66f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 106.0f);
        pathBuilder.lineTo(70.77f, 128.0f);
        pathBuilder.lineTo(30.0f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(83.43f, 134.76f);
        pathBuilder.lineTo(122.0f, 155.58f);
        pathBuilder.lineTo(122.0f, 206.0f);
        pathBuilder.lineTo(36.66f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 206.0f);
        pathBuilder.lineTo(134.0f, 155.58f);
        pathBuilder.lineToRelative(38.57f, -20.77f);
        pathBuilder.lineTo(219.34f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codepenLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
