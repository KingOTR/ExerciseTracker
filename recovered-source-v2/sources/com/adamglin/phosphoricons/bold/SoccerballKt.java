package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Soccerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SoccerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSoccerBall", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_soccerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerballKt {
    private static ImageVector _soccerBall;

    public static final ImageVector getSoccerBall(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _soccerBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SoccerBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(199.88f, 171.42f);
        pathBuilder.horizontalLineToRelative(-24.0f);
        pathBuilder.lineTo(166.1f, 158.0f);
        pathBuilder.lineToRelative(11.3f, -32.94f);
        pathBuilder.lineTo(193.15f, 120.0f);
        pathBuilder.lineToRelative(18.6f, 14.26f);
        pathBuilder.arcTo(83.42f, 83.42f, 0.0f, false, true, 199.88f, 171.42f);
        pathBuilder.close();
        pathBuilder.moveTo(44.25f, 134.21f);
        pathBuilder.lineTo(62.85f, 120.0f);
        pathBuilder.lineToRelative(15.75f, 5.11f);
        pathBuilder.lineTo(89.9f, 158.0f);
        pathBuilder.lineToRelative(-9.75f, 13.42f);
        pathBuilder.horizontalLineToRelative(-24.0f);
        pathBuilder.arcTo(83.42f, 83.42f, 0.0f, false, true, 44.25f, 134.21f);
        pathBuilder.close();
        pathBuilder.moveTo(111.85f, 148.0f);
        pathBuilder.lineToRelative(-9.54f, -27.77f);
        pathBuilder.lineTo(128.0f, 102.56f);
        pathBuilder.lineToRelative(25.69f, 17.67f);
        pathBuilder.lineTo(144.15f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.51f, 74.27f);
        pathBuilder.lineTo(185.73f, 97.12f);
        pathBuilder.lineTo(169.92f, 102.26f);
        pathBuilder.lineTo(140.0f, 81.69f);
        pathBuilder.lineTo(140.0f, 65.46f);
        pathBuilder.lineToRelative(21.22f, -14.59f);
        pathBuilder.arcTo(84.27f, 84.27f, 0.0f, false, true, 192.51f, 74.27f);
        pathBuilder.close();
        pathBuilder.moveTo(94.78f, 50.87f);
        pathBuilder.lineTo(116.0f, 65.46f);
        pathBuilder.lineTo(116.0f, 81.69f);
        pathBuilder.lineTo(86.08f, 102.26f);
        pathBuilder.lineTo(70.27f, 97.12f);
        pathBuilder.lineTo(63.49f, 74.27f);
        pathBuilder.arcTo(84.27f, 84.27f, 0.0f, false, true, 94.78f, 50.87f);
        pathBuilder.close();
        pathBuilder.moveTo(108.36f, 209.66f);
        pathBuilder.lineTo(99.74f, 185.29f);
        pathBuilder.lineTo(109.39f, 172.0f);
        pathBuilder.horizontalLineToRelative(37.22f);
        pathBuilder.lineToRelative(9.65f, 13.29f);
        pathBuilder.lineToRelative(-8.62f, 24.37f);
        pathBuilder.arcToRelative(83.59f, 83.59f, 0.0f, false, true, -39.28f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _soccerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
