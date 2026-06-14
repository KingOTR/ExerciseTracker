package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Codepenlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodepenLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCodepenLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codepenLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodepenlogoKt {
    private static ImageVector _codepenLogo;

    public static final ImageVector getCodepenLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(235.79f, 89.0f);
        pathBuilder.lineToRelative(-104.0f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.58f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.21f, 7.05f);
        pathBuilder.lineToRelative(104.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder.lineToRelative(104.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 160.0f);
        pathBuilder.lineTo(240.0f, 96.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 235.79f, 89.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 146.61f);
        pathBuilder.lineTo(189.45f, 128.0f);
        pathBuilder.lineTo(224.0f, 109.39f);
        pathBuilder.close();
        pathBuilder.moveTo(172.57f, 118.91f);
        pathBuilder.lineTo(136.0f, 99.22f);
        pathBuilder.lineTo(136.0f, 53.39f);
        pathBuilder.lineTo(215.13f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 142.91f);
        pathBuilder.lineTo(100.3f, 128.0f);
        pathBuilder.lineTo(128.0f, 113.09f);
        pathBuilder.lineTo(155.7f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 53.39f);
        pathBuilder.lineTo(120.0f, 99.22f);
        pathBuilder.lineTo(83.43f, 118.91f);
        pathBuilder.lineTo(40.87f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 109.39f);
        pathBuilder.lineTo(66.55f, 128.0f);
        pathBuilder.lineTo(32.0f, 146.61f);
        pathBuilder.close();
        pathBuilder.moveTo(83.43f, 137.09f);
        pathBuilder.lineTo(120.0f, 156.78f);
        pathBuilder.verticalLineToRelative(45.83f);
        pathBuilder.lineTo(40.87f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 202.61f);
        pathBuilder.lineTo(136.0f, 156.78f);
        pathBuilder.lineToRelative(36.57f, -19.69f);
        pathBuilder.lineTo(215.13f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codepenLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
