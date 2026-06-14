package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Codepenlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodepenLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCodepenLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codepenLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodepenlogoKt {
    private static ImageVector _codepenLogo;

    public static final ImageVector getCodepenLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(234.0f, 92.55f);
        pathBuilder.reflectiveCurveToRelative(-0.05f, 0.0f, -0.09f, -0.07f);
        pathBuilder.lineToRelative(-104.0f, -56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 56.0f);
        pathBuilder.lineToRelative(-0.11f, 0.08f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.45f);
        pathBuilder.arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.09f, 0.07f);
        pathBuilder.lineToRelative(104.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f);
        pathBuilder.lineToRelative(104.0f, -56.0f);
        pathBuilder.arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.08f, -0.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.45f);
        pathBuilder.lineTo(235.97f, 96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 234.0f, 92.55f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 153.3f);
        pathBuilder.lineTo(181.0f, 128.0f);
        pathBuilder.lineToRelative(47.0f, -25.3f);
        pathBuilder.close();
        pathBuilder.moveTo(172.57f, 123.46f);
        pathBuilder.lineTo(132.0f, 101.61f);
        pathBuilder.lineTo(132.0f, 46.7f);
        pathBuilder.lineTo(223.56f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 147.46f);
        pathBuilder.lineTo(91.87f, 128.0f);
        pathBuilder.lineTo(128.0f, 108.54f);
        pathBuilder.lineTo(164.13f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 46.7f);
        pathBuilder.verticalLineToRelative(54.91f);
        pathBuilder.lineTo(83.43f, 123.46f);
        pathBuilder.lineTo(32.44f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 102.7f);
        pathBuilder.lineTo(75.0f, 128.0f);
        pathBuilder.lineTo(28.0f, 153.3f);
        pathBuilder.close();
        pathBuilder.moveTo(83.43f, 132.54f);
        pathBuilder.lineTo(124.0f, 154.39f);
        pathBuilder.lineTo(124.0f, 209.3f);
        pathBuilder.lineTo(32.44f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 209.3f);
        pathBuilder.lineTo(132.0f, 154.39f);
        pathBuilder.lineToRelative(40.57f, -21.85f);
        pathBuilder.lineToRelative(51.0f, 27.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codepenLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
