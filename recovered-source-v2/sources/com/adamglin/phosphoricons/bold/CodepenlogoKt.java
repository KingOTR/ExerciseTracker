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

/* compiled from: Codepenlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodepenLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCodepenLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codepenLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodepenlogoKt {
    private static ImageVector _codepenLogo;

    public static final ImageVector getCodepenLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(237.68f, 85.43f);
        pathBuilder.lineToRelative(-104.0f, -56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.38f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.32f, 10.57f);
        pathBuilder.lineToRelative(104.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f);
        pathBuilder.lineToRelative(104.0f, -56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 160.0f);
        pathBuilder.lineTo(244.0f, 96.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 237.68f, 85.43f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 139.91f);
        pathBuilder.lineTo(197.88f, 128.0f);
        pathBuilder.lineTo(220.0f, 116.09f);
        pathBuilder.close();
        pathBuilder.moveTo(172.57f, 114.37f);
        pathBuilder.lineTo(140.0f, 96.83f);
        pathBuilder.lineTo(140.0f, 60.09f);
        pathBuilder.lineTo(206.69f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 138.37f);
        pathBuilder.lineTo(108.74f, 128.0f);
        pathBuilder.lineTo(128.0f, 117.63f);
        pathBuilder.lineTo(147.26f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 60.09f);
        pathBuilder.lineTo(116.0f, 96.83f);
        pathBuilder.lineTo(83.43f, 114.37f);
        pathBuilder.lineTo(49.31f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 116.09f);
        pathBuilder.lineTo(58.12f, 128.0f);
        pathBuilder.lineTo(36.0f, 139.91f);
        pathBuilder.close();
        pathBuilder.moveTo(83.43f, 141.63f);
        pathBuilder.lineTo(116.0f, 159.17f);
        pathBuilder.verticalLineToRelative(36.74f);
        pathBuilder.lineTo(49.31f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 195.91f);
        pathBuilder.lineTo(140.0f, 159.17f);
        pathBuilder.lineToRelative(32.57f, -17.54f);
        pathBuilder.lineTo(206.69f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codepenLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
