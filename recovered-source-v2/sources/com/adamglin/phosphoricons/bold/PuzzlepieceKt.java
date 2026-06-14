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

/* compiled from: Puzzlepiece.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PuzzlePiece", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPuzzlePiece", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_puzzlePiece", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PuzzlepieceKt {
    private static ImageVector _puzzlePiece;

    public static final ImageVector getPuzzlePiece(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _puzzlePiece;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PuzzlePiece", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.41f, 155.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.56f, -0.69f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 139.0f);
        pathBuilder.arcTo(16.2f, 16.2f, 0.0f, false, true, 202.8f, 124.0f);
        pathBuilder.arcToRelative(15.83f, 15.83f, 0.0f, false, true, 8.0f, 1.5f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 114.7f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(40.15f, 40.15f, 0.0f, false, false, -12.62f, -29.16f);
        pathBuilder.arcToRelative(39.67f, 39.67f, 0.0f, false, false, -29.94f, -10.76f);
        pathBuilder.arcToRelative(40.08f, 40.08f, 0.0f, false, false, -37.34f, 37.0f);
        pathBuilder.curveTo(96.0f, 50.07f, 96.0f, 51.0f, 96.0f, 52.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 72.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(40.15f, 40.15f, 0.0f, false, false, -29.16f, 12.62f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 41.1f, 179.9f);
        pathBuilder.arcToRelative(28.3f, 28.3f, 0.0f, false, false, 2.9f, 0.1f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 222.41f, 155.16f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 204.0f);
        pathBuilder.horizontalLineTo(68.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.15f, -10.84f);
        pathBuilder.arcTo(15.9f, 15.9f, 0.0f, false, true, 42.8f, 156.0f);
        pathBuilder.arcTo(16.2f, 16.2f, 0.0f, false, true, 28.0f, 141.06f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.82f, -15.52f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 114.7f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineToRelative(42.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.83f, -17.15f);
        pathBuilder.arcTo(15.9f, 15.9f, 0.0f, false, true, 120.0f, 50.8f);
        pathBuilder.arcTo(16.19f, 16.19f, 0.0f, false, true, 134.94f, 36.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.53f, 22.81f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 161.31f, 76.0f);
        pathBuilder.horizontalLineTo(204.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.curveToRelative(-1.0f, 0.0f, -1.93f, 0.0f, -2.9f, 0.11f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 204.0f, 180.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _puzzlePiece = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
